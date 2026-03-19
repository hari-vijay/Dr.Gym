import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {

    public static String currentUser;

    static CalorieCalculator calculator = new CalorieCalculator();

    // ================= USER =================
    static class User {
        private String username;
        private String password;

        public void setCredentials(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    // ================= LOGIN MANAGER =================
    static class LoginManager {

        private Scanner sc = new Scanner(System.in);
        private int failedAttempts = 0;
        private final int MAX_ATTEMPTS = 3;

        public int showLoginMenu() {

            System.out.println(colors.CYAN_BOLD + "\n====== LOGIN / REGISTER ======" + colors.RESET);
            System.out.println(colors.YELLOW + "1. Register" + colors.RESET);
            System.out.println(colors.YELLOW + "2. Login" + colors.RESET);
            System.out.println(colors.YELLOW + "3. Exit" + colors.RESET);

            System.out.print(colors.BLUE + "Enter Choice: " + colors.RESET);
            return sc.nextInt();
        }

        public void register(User user) {

            System.out.println(colors.CYAN + "\n----- REGISTER -----" + colors.RESET);

            System.out.print(colors.BLUE + "Create Username: " + colors.RESET);
            String username = sc.next();

            if (!username.matches("[a-zA-Z0-9]{4,}")) {
                System.out.println(colors.RED + "Invalid Username!" + colors.RESET);
                return;
            }

            System.out.print(colors.BLUE + "Create Password: " + colors.RESET);
            String password = sc.next();

            if (password.length() < 6 || !password.matches(".*\\d.*")) {
                System.out.println(colors.RED + "Invalid Password!" + colors.RESET);
                return;
            }

            try {
                Connection con = DBConnection.getConnection();

                String query = "INSERT INTO users(username, password) VALUES (?, ?)";
                PreparedStatement ps = con.prepareStatement(query);

                ps.setString(1, username);
                ps.setString(2, password);

                ps.executeUpdate();

                System.out.println(colors.GREEN_BOLD + "Registration Successful! ✅" + colors.RESET);

            } catch (Exception e) {
                System.out.println(colors.RED + "DB Error: " + e + colors.RESET);
            }
        }

        public boolean login(User user) {

            while (failedAttempts < MAX_ATTEMPTS) {

                System.out.println(colors.CYAN + "\n----- LOGIN -----" + colors.RESET);

                System.out.print(colors.BLUE + "Username: " + colors.RESET);
                String enteredUser = sc.next();

                System.out.print(colors.BLUE + "Password: " + colors.RESET);
                String enteredPass = sc.next();

                try {
                    Connection con = DBConnection.getConnection();

                    String query = "SELECT * FROM users WHERE username=? AND password=?";
                    PreparedStatement ps = con.prepareStatement(query);

                    ps.setString(1, enteredUser);
                    ps.setString(2, enteredPass);

                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        System.out.println(colors.GREEN_BOLD + "Login Successful! ✅" + colors.RESET);
                        failedAttempts = 0;

                        currentUser = enteredUser;

                        return true;
                    } else {
                        handleLoginAttempt();
                    }

                } catch (Exception e) {
                    System.out.println(colors.RED + "DB Error: " + e + colors.RESET);
                }
            }

            System.out.println(colors.RED_BOLD + "Too many failed attempts!" + colors.RESET);
            failedAttempts = 0;
            return false;
        }

        private void handleLoginAttempt() {
            failedAttempts++;
            int remaining = MAX_ATTEMPTS - failedAttempts;

            System.out.println(colors.RED + "Invalid credentials!" + colors.RESET);
            if (remaining > 0) {
                System.out.println(colors.YELLOW + "Attempts remaining: " + remaining + colors.RESET);
            }
        }
    }

    // ================= HEALTH DETAILS =================
    static class HealthDetails {

        protected int age;
        protected double height;
        protected double weight;
        protected String gender;

        Scanner sc = new Scanner(System.in);

        public void enterHealthDetails() {

            System.out.println(colors.CYAN_BOLD + "\n----- ENTER HEALTH DETAILS -----" + colors.RESET);

            System.out.print(colors.BLUE + "Enter Age: " + colors.RESET);
            age = sc.nextInt();

            System.out.print(colors.BLUE + "Enter Gender: " + colors.RESET);
            gender = sc.next();

            System.out.print(colors.BLUE + "Enter Height (m): " + colors.RESET);
            height = sc.nextDouble();

            System.out.print(colors.BLUE + "Enter Weight (kg): " + colors.RESET);
            weight = sc.nextDouble();

            Login.calculator.age = age;
            Login.calculator.gender = gender;
            Login.calculator.height = height;
            Login.calculator.weight = weight;

            try {
                Connection con = DBConnection.getConnection();

                String query = "UPDATE users SET age=?, gender=?, height=?, weight=? WHERE username=?";
                PreparedStatement ps = con.prepareStatement(query);

                ps.setInt(1, age);
                ps.setString(2, gender);
                ps.setDouble(3, height);
                ps.setDouble(4, weight);
                ps.setString(5, currentUser);

                ps.executeUpdate();

                System.out.println(colors.GREEN + "Health details saved  ✅" + colors.RESET);

            } catch (Exception e) {
                System.out.println(colors.RED + "DB Error: " + e + colors.RESET);
            }
        }
    }

    // ================= CALCULATOR =================
    static class CalorieCalculator extends HealthDetails {

        public void calculate() {

            double heightCm = height * 100;
            double calories;

            if (gender.equalsIgnoreCase("male")) {
                calories = (10 * weight) + (6.25 * heightCm) - (5 * age) + 5;
            } else {
                calories = (10 * weight) + (6.25 * heightCm) - (5 * age) - 161;
            }

            System.out.println(colors.GREEN + "\nCalories: " + calories + colors.RESET);
        }
    }

    // ================= UPDATE FIELD =================
    static void updateField(String column, Object value) {

        try {
            Connection con = DBConnection.getConnection();

            String query = "UPDATE users SET " + column + "=? WHERE username=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setObject(1, value);
            ps.setString(2, currentUser);

            ps.executeUpdate();

            System.out.println(colors.GREEN + "Updated successfully ✅" + colors.RESET);

        } catch (Exception e) {
            System.out.println(colors.RED + "DB Error: " + e + colors.RESET);
        }
    }

    // ================= MAIN LOGIN FLOW =================
    public static boolean login() {

        System.out.println(colors.CYAN_BOLD + "==============================================" + colors.RESET);
        System.out.println(colors.CYAN_BOLD + "               Welcome to Dr.GYM " + colors.RESET);
        System.out.println(colors.CYAN_BOLD + "==============================================" + colors.RESET);

        LoginManager loginManager = new LoginManager();
        User user = new User();

        while (true) {

            int choice = loginManager.showLoginMenu();

            switch (choice) {

                case 1:
                    loginManager.register(user);
                    break;

                case 2:
                    if (loginManager.login(user)) {

                        try {
                            Connection con = DBConnection.getConnection();

                            String query = "SELECT age, gender, height, weight FROM users WHERE username=?";
                            PreparedStatement ps = con.prepareStatement(query);
                            ps.setString(1, currentUser);

                            ResultSet rs = ps.executeQuery();

                            if (rs.next()) {

                                int age = rs.getInt("age");

                                if (age == 0) {
                                    calculator.enterHealthDetails();
                                } else {
                                    calculator.age = age;
                                    calculator.gender = rs.getString("gender");
                                    calculator.height = rs.getDouble("height");
                                    calculator.weight = rs.getDouble("weight");
                                }
                            }

                        } catch (Exception e) {
                            System.out.println(colors.RED + "DB Error: " + e + colors.RESET);
                        }

                        return true;
                    }
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println(colors.RED + "Invalid Choice!" + colors.RESET);
            }
        }
    }

    public static void main(String[] args) {
        login();
    }
}