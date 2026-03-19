import java.util.*;
import java.sql.*;
import java.time.LocalDate;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        // 🔥 LOGIN
        boolean loginStatus = Login.login();

        if (!loginStatus) {
            System.out.println(colors.RED + "Login Failed ❌" + colors.RESET);
            return;
        }

        System.out.println(colors.GREEN + "Login Successful ✅" + colors.RESET);

        // 🔁 MAIN LOOP
        while (true) {

            boolean isPremium = getPremiumStatus();

            System.out.println(colors.CYAN_BOLD + "\n===== MAIN MENU =====" + colors.RESET);

            System.out.println(colors.YELLOW + "1. AI Assistance" + colors.RESET);
            System.out.println(colors.YELLOW + "2. BMI" + colors.RESET);
            System.out.println(colors.YELLOW + "3. Macro" + colors.RESET);
            System.out.println(colors.YELLOW + "4. Diet Plan" + colors.RESET);
            System.out.println(colors.YELLOW + "5. Workout" + colors.RESET);
            System.out.println(colors.YELLOW + "6. Edit Details" + colors.RESET);
            System.out.println(colors.YELLOW + "7. Payment" + colors.RESET);

            if (isPremium) {
                System.out.println(colors.PURPLE_BOLD + "8. Premium Features 🔥" + colors.RESET);
            }

            System.out.println(colors.RED + "0. Exit" + colors.RESET);

            System.out.print(colors.BLUE + "Enter Choice: " + colors.RESET);
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    AI ai = new AI();
                    ai.AIBOT();
                    break;

                case 2:
                    BMI bmi = new BMI();
                    bmi.calculateBMI(Login.calculator.weight, Login.calculator.height);
                    break;

                case 3:
                    macrocalculator mc = new macrocalculator();
                    mc.macroCalculator();
                    break;

                case 4:
                    if (isPremium) {
                        DietPlan dp = new DietPlan();
                        dp.startDietModule(true); // premium
                    } else {
                        NormalDiet nd = new NormalDiet();
                        nd.normaldiet();
                    }
                    break;

                case 5:
                    Normalworkout nw = new Normalworkout();
                    nw.NormalFeatures();
                    break;

                case 6:
                    editDetails();
                    break;

                case 7:
                    handlePayment();
                    break;

                case 8:
                    if (isPremium) {
                        premium p = new premium();
                        p.premiumUser();
                    } else {
                        System.out.println(colors.RED + "❌ Not a premium user" + colors.RESET);
                    }
                    break;

                case 0:
                    System.out.println(colors.GREEN + "Thank you 💪" + colors.RESET);
                    System.exit(0);

                default:
                    System.out.println(colors.RED + "Invalid choice" + colors.RESET);
            }
        }
    }

    // ================= PAYMENT FLOW =================
    static void handlePayment() {

        boolean paid = Payment.processPayment();

        if (!paid) {
            System.out.println(colors.RED + "❌ Payment Failed" + colors.RESET);
            return;
        }

        System.out.println(colors.GREEN + "✅ Payment Successful" + colors.RESET);

        try {
            Connection con = DBConnection.getConnection();

            LocalDate today = LocalDate.now();
            LocalDate expiry = today.plusMonths(1);

            String update = "UPDATE users SET amount=?, payment_status=?, premium=?, expiry_date=? WHERE username=?";
            PreparedStatement ps = con.prepareStatement(update);

            ps.setLong(1, Payment.amount);
            ps.setString(2, "PAID");
            ps.setBoolean(3, true);
            ps.setDate(4, java.sql.Date.valueOf(expiry));
            ps.setString(5, Login.currentUser);

            int rows = ps.executeUpdate();

            if (rows == 0) {
                System.out.println(colors.RED + "❌ User update failed" + colors.RESET);
                return;
            }

            String q = "SELECT * FROM users WHERE username=?";
            PreparedStatement ps2 = con.prepareStatement(q);
            ps2.setString(1, Login.currentUser);

            ResultSet rs = ps2.executeQuery();

            if (rs.next()) {

                int id = rs.getInt("id");

                String qrData =
                        "===== DR GYM MEMBERSHIP =====\n" +
                                "\nID: " + id + "\n" +
                                "\nUser: " + rs.getString("username") + "\n" +
                                "\nAmount: " + rs.getDouble("amount") + "\n" +
                                "\nAge: " + rs.getInt("age") + "\n" +
                                "\nWeight: " + rs.getDouble("weight") + "\n" +
                                "\nValid Till: " + expiry + "\n" +
                                "S\ntatus: PAID";

                QRgenerator.generateQR(qrData, id);

                System.out.println(colors.PURPLE_BOLD + "🔥 Premium Activated!" + colors.RESET);
            } else {
                System.out.println(colors.RED + "❌ User not found after update!" + colors.RESET);
            }

        } catch (Exception e) {
            System.out.println(colors.RED + "Payment Error: " + e + colors.RESET);
        }
    }

    // ================= EDIT =================
    static void editDetails() {

        System.out.println(colors.CYAN_BOLD + "\n--- EDIT DETAILS ---" + colors.RESET);

        System.out.println(colors.YELLOW + "1. Age" + colors.RESET);
        System.out.println(colors.YELLOW + "2. Gender" + colors.RESET);
        System.out.println(colors.YELLOW + "3. Height" + colors.RESET);
        System.out.println(colors.YELLOW + "4. Weight" + colors.RESET);

        System.out.print(colors.BLUE + "Enter Choice: " + colors.RESET);
        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                System.out.print(colors.BLUE + "New Age: " + colors.RESET);
                Login.calculator.age = sc.nextInt();
                Login.updateField("age", Login.calculator.age);
                break;

            case 2:
                System.out.print(colors.BLUE + "New Gender: " + colors.RESET);
                Login.calculator.gender = sc.next();
                Login.updateField("gender", Login.calculator.gender);
                break;

            case 3:
                System.out.print(colors.BLUE + "New Height: " + colors.RESET);
                Login.calculator.height = sc.nextDouble();
                Login.updateField("height", Login.calculator.height);
                break;

            case 4:
                System.out.print(colors.BLUE + "New Weight: " + colors.RESET);
                Login.calculator.weight = sc.nextDouble();
                Login.updateField("weight", Login.calculator.weight);
                break;
        }
    }

    // ================= PREMIUM CHECK =================
    static boolean getPremiumStatus() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "SELECT premium FROM users WHERE username=?";
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, Login.currentUser);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getBoolean("premium");
            }

        } catch (Exception e) {
            System.out.println(colors.RED + "DB Error: " + e + colors.RESET);
        }

        return false;
    }
}