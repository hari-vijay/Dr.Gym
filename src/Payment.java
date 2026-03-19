import java.util.Scanner;
import java.util.Random;

class Payment {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static long amount = 999;

    // 🔥 MAIN METHOD (ONLY PAYMENT LOGIC)
    public static boolean processPayment() {

        System.out.println(colors.CYAN_BOLD + "\n***** PAYMENT OPTIONS *****" + colors.RESET);

        System.out.println(colors.YELLOW + "1. UPI" + colors.RESET);
        System.out.println(colors.YELLOW + "2. Debit Card" + colors.RESET);
        System.out.println(colors.YELLOW + "3. Credit Card" + colors.RESET);
        System.out.println(colors.YELLOW + "4. NetBanking" + colors.RESET);

        System.out.print(colors.BLUE + "Enter Choice: " + colors.RESET);
        int choice = sc.nextInt();

        switch (choice) {
            case 1: return upi();
            case 2: return debit();
            case 3: return credit();
            case 4: return net();
            default:
                System.out.println(colors.RED + "Invalid choice" + colors.RESET);
                return false;
        }
    }

    // 🔽 UPI PAYMENT
    static boolean upi() {

        System.out.println(colors.PURPLE_BOLD + "\n--- UPI PAYMENT ---" + colors.RESET);
        System.out.println(colors.CYAN + "Premium cost : " + amount + colors.RESET);
        System.out.println();

        System.out.print(colors.BLUE + "Enter 12-digit UPI ID: " + colors.RESET);
        sc.next();
        System.out.print(colors.WHITE + "Processing Payment......." + colors.RESET);
        for(int i = 0; i < 3; i++){
            try {
                Thread.sleep(700);
            } catch (Exception e) {}
            System.out.print(".");
        }
        System.out.println();

        // 🔥 SMALL DELAY BEFORE OTP
        try { Thread.sleep(1500); } catch (Exception e) {}

        int otp = 1000 + r.nextInt(9000);
        System.out.println(colors.YELLOW + "OTP: " + otp + colors.RESET);

        System.out.print(colors.BLUE + "Enter OTP: " + colors.RESET);
        int enteredOtp = sc.nextInt();

        if (otp == enteredOtp) {

            System.out.print(colors.BLUE + "Enter UPI PIN: " + colors.RESET);
            int pin = sc.nextInt();

            if (pin >= 1000 && pin <= 9999) {
                System.out.println(colors.GREEN + "Payment Verified ✅" + colors.RESET);
                return true;
            }
        }

        //System.out.println(colors.RED + "Payment Failed ❌" + colors.RESET);
        return false;
    }

    // 🔽 DEBIT CARD
    static boolean debit() {

        System.out.println(colors.PURPLE_BOLD + "\n--- DEBIT CARD PAYMENT ---" + colors.RESET);
        System.out.println(colors.CYAN + "Premium cost : " + amount + colors.RESET);
        System.out.println();

        System.out.print(colors.BLUE + "Enter 16-digit Debit Card Number: " + colors.RESET);
        sc.nextLong();
        System.out.println(colors.BLUE + "Enter CVV Number: " + colors.RESET);
        sc.nextInt();
        System.out.print(colors.WHITE + "Redirecting ......" + colors.RESET);
        for(int i = 0; i < 3; i++){
            try {
                Thread.sleep(700);
            } catch (Exception e) {}
            System.out.print(".");
        }
        System.out.println();

        // 🔥 SMALL DELAY BEFORE OTP
        try { Thread.sleep(1500); } catch (Exception e) {}
        int otp = 1000 + r.nextInt(9000);
        System.out.println(colors.YELLOW + "OTP: " + otp + colors.RESET);

        System.out.print(colors.BLUE + "Enter OTP: " + colors.RESET);
        int enteredOtp = sc.nextInt();

        if (otp == enteredOtp) {

            System.out.print(colors.BLUE + "Enter ATM PIN: " + colors.RESET);
            int pin = sc.nextInt();

            if (pin >= 1000 && pin <= 100000) {
                System.out.println(colors.GREEN + "Payment Verified ✅" + colors.RESET);
                return true;
            }
        }

        //System.out.println(colors.RED + "Payment Failed ❌" + colors.RESET);
        return false;
    }

    // 🔽 CREDIT CARD
    static boolean credit() {

        System.out.println(colors.PURPLE_BOLD + "\n--- CREDIT CARD PAYMENT ---" + colors.RESET);
        System.out.println(colors.CYAN + "Premium cost : " + amount + colors.RESET);
        System.out.println();

        System.out.print(colors.BLUE + "Enter 16-Credit Card Number: " + colors.RESET);
        sc.nextLong();
        System.out.println(colors.BLUE + "Enter CVV Number: " + colors.RESET);
        sc.nextInt();
        System.out.print(colors.WHITE + "Redirecting Payment......." + colors.RESET);
        for(int i = 0; i < 3; i++){
            try {
                Thread.sleep(700);
            } catch (Exception e) {}
            System.out.print(".");
        }
        System.out.println();

        // 🔥 SMALL DELAY BEFORE OTP
        try { Thread.sleep(1500); } catch (Exception e) {}
        int otp = 1000 + r.nextInt(9000);
        System.out.println(colors.YELLOW + "OTP: " + otp + colors.RESET);

        System.out.print(colors.BLUE + "Enter OTP: " + colors.RESET);
        int enteredOtp = sc.nextInt();

        if (otp == enteredOtp) {

            System.out.print(colors.BLUE + "Enter Card PIN: " + colors.RESET);
            int pin = sc.nextInt();

            if (pin >= 1000 && pin <= 9999) {
                System.out.println(colors.GREEN + "Payment Verified ✅" + colors.RESET);
                return true;
            }
        }

       // System.out.println(colors.RED + "Payment Failed ❌" + colors.RESET);
        return false;
    }

    // 🔽 NET BANKING
    static boolean net() {

        System.out.println(colors.PURPLE_BOLD + "\n--- NET BANKING PAYMENT ---" + colors.RESET);
        System.out.println(colors.CYAN + "Premium cost : " + amount + colors.RESET);
        System.out.println();

        System.out.print(colors.BLUE + "Enter Bank Name: " + colors.RESET);
        sc.next();

        System.out.print(colors.WHITE + "Redirecting to Bank" + colors.RESET);
        for(int i = 0; i < 3; i++){
            try {
                Thread.sleep(700);
            } catch (Exception e) {}
            System.out.print(".");
        }
        System.out.println();

        // 🔥 SMALL DELAY BEFORE OTP
        try { Thread.sleep(1500); } catch (Exception e) {}

        int otp = 1000 + r.nextInt(9000);
        System.out.println(colors.YELLOW + "OTP: " + otp + colors.RESET);

        System.out.print(colors.BLUE + "Enter OTP: " + colors.RESET);
        int enteredOtp = sc.nextInt();
        if (otp == enteredOtp) {

            System.out.print(colors.BLUE + "Enter Bank PIN: " + colors.RESET);
            int pin = sc.nextInt();

            if (pin >= 1000 && pin <= 100000) {
                //System.out.println(colors.GREEN + "Payment Verified ✅" + colors.RESET);
                return true;
            }
        }

      //  System.out.println(colors.RED + "Payment Failed ❌" + colors.RESET);
        return false;
    }
}