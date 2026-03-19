interface PremiumFeatures {

    void customizedworkout();
    void weeklyreport();
    void Injurysafeworkout();
    void bmi();
}

abstract class PremiumUser {
    abstract void FeatureAccess();
}

class access extends PremiumUser implements PremiumFeatures {

    public void customizedworkout(){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println(colors.CYAN_BOLD + "\nPlease Choose your Goal Based on BMI" + colors.RESET);
        System.out.println(colors.YELLOW + "1 Weight Loss" + colors.RESET);
        System.out.println(colors.YELLOW + "2 Muscle Gain" + colors.RESET);
        System.out.println(colors.YELLOW + "3 General Fitness" + colors.RESET);

        System.out.print(colors.BLUE + "Enter Choice: " + colors.RESET);
        int goal = sc.nextInt();

        switch(goal){

            case 1:
                System.out.println(colors.PURPLE_BOLD + "------ Weight Loss Workout ------" + colors.RESET);
                System.out.println("1.Beginner");
                System.out.println("2.Intermediate");
                System.out.println("3.Advance");

                int op=sc.nextInt();

                switch(op) {
                    case 1:
                        System.out.println(colors.GREEN + "Running - 20 min" + colors.RESET);
                        System.out.println(colors.GREEN + "Jump Rope - 10 min" + colors.RESET);
                        System.out.println(colors.GREEN + "Cycling - 15 min" + colors.RESET);
                        break;

                    case 2:
                        System.out.println(colors.GREEN + "Running - 20 min x 3/7 Days" + colors.RESET);
                        System.out.println(colors.GREEN + "Jump Rope - 10 min x 3/7 Days" + colors.RESET);
                        System.out.println(colors.GREEN + "Cycling - 15 min x 3/7 Days" + colors.RESET);
                        System.out.println(colors.CYAN + "Strength Training 3x days a week" + colors.RESET);
                        break;

                    case 3:
                        System.out.println(colors.GREEN + "Running - 20 min" + colors.RESET);
                        System.out.println(colors.GREEN + "Jump Rope - 10 min" + colors.RESET);
                        System.out.println(colors.GREEN + "Cycling - 15 min" + colors.RESET);
                        System.out.println(colors.CYAN + "Strength Training 6x days a week" + colors.RESET);
                        System.out.println("Day 1 : Chest + Triceps");
                        System.out.println("Day 2 : Back + Biceps");
                        System.out.println("Day 3 : Legs");
                        System.out.println("Day 4 : Shoulders");
                        System.out.println("Day 5 : Cardio + Abs");
                        break;

                    default:
                        System.out.println(colors.RED + "invalid option" + colors.RESET);
                        break;
                }
                break;

            case 2:
                System.out.println(colors.PURPLE_BOLD + "------ Muscle Gain Workout ------" + colors.RESET);
                System.out.println("1.Beginner");
                System.out.println("2.Intermediate");
                System.out.println("3.Advance");

                int op2=sc.nextInt();

                switch(op2) {
                    case 1:
                        System.out.println(colors.GREEN + "Low Weighted Bench Press" + colors.RESET);
                        System.out.println(colors.GREEN + "Push Ups" + colors.RESET);
                        System.out.println(colors.GREEN + "Pull Ups" + colors.RESET);
                        break;

                    case 2:
                        System.out.println(colors.GREEN + "Low Weighted Bench Press" + colors.RESET);
                        System.out.println(colors.GREEN + "Low weight Deadlift" + colors.RESET);
                        System.out.println(colors.GREEN + "Low weight Squats" + colors.RESET);
                        System.out.println(colors.GREEN + "Push Ups" + colors.RESET);
                        System.out.println(colors.GREEN + "Pull Ups" + colors.RESET);
                        break;

                    case 3:
                        System.out.println(colors.GREEN + "Push Ups" + colors.RESET);
                        System.out.println(colors.GREEN + "Pull Ups" + colors.RESET);
                        System.out.println(colors.CYAN + "Strength Training 6x days a week" + colors.RESET);
                        System.out.println("Day 1 : Chest + Triceps");
                        System.out.println("Day 2 : Back + Biceps");
                        System.out.println("Day 3 : Legs");
                        System.out.println("Day 4 : Shoulders");
                        System.out.println("Day 5 : Cardio + Abs");
                        break;
                }
                break;

            case 3:
                System.out.println(colors.PURPLE_BOLD + "------ Fitness Workout ------" + colors.RESET);
                System.out.println("1.Beginner");
                System.out.println("2.Intermediate");
                System.out.println("3.Advance");

                int op3=sc.nextInt();

                switch(op3) {
                    case 1:
                        System.out.println(colors.GREEN + "Running - 20 min" + colors.RESET);
                        System.out.println(colors.GREEN + "Jump Rope - 10 min" + colors.RESET);
                        System.out.println(colors.GREEN + "Cycling - 15 min" + colors.RESET);
                        break;

                    case 2:
                        System.out.println(colors.GREEN + "Push Ups" + colors.RESET);
                        System.out.println(colors.GREEN + "Squats" + colors.RESET);
                        System.out.println(colors.GREEN + "Plank" + colors.RESET);
                        System.out.println(colors.GREEN + "Running - 20 min" + colors.RESET);
                        System.out.println(colors.CYAN + "Strength Training 6x days a week" + colors.RESET);
                        break;

                    case 3:
                        System.out.println(colors.GREEN + "Push Ups" + colors.RESET);
                        System.out.println(colors.GREEN + "Squats" + colors.RESET);
                        System.out.println(colors.GREEN + "Plank" + colors.RESET);
                        System.out.println(colors.GREEN + "Running - 20 min" + colors.RESET);
                        System.out.println("Day 1 : Chest + Triceps");
                        System.out.println("Day 2 : Back + Biceps");
                        System.out.println("Day 3 : Legs");
                        System.out.println("Day 4 : Shoulders");
                        System.out.println("Day 5 : Cardio + Abs");
                        System.out.println(colors.CYAN + "Strength Training 6x days a week" + colors.RESET);
                        break;
                }
                break;

            default:
                System.out.println(colors.RED + "Invalid Goal" + colors.RESET);
                break;
        }
    }

    public void Injurysafeworkout(){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print(colors.BLUE + "Do you have any injury? (yes/no): " + colors.RESET);
        String injury = sc.next();

        if(injury.equalsIgnoreCase("yes")) {
            System.out.println(colors.YELLOW_BOLD + "Do's" + colors.RESET);
            System.out.println(colors.GREEN + "1.cardio\n2.strechings\n3.mobility workouts\n4.lite weights" + colors.RESET);

            System.out.println(colors.RED_BOLD + "Don't" + colors.RESET);
            System.out.println(colors.RED + "1.Heavy weights\n2.Long training\n3.Heavy Squats" + colors.RESET);
        }
        else{
            System.out.println(colors.GREEN + "I'm Happy to hear that continue with other options 😊" + colors.RESET);
        }
    }

    public void weeklyreport(){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println(colors.CYAN_BOLD + "\n------ Weekly Fitness Report ------" + colors.RESET);

        System.out.print(colors.BLUE + "Enter your current weight (kg): " + colors.RESET);
        double currentWeight = sc.nextDouble();

        System.out.print(colors.BLUE + "How many days did you workout this week? " + colors.RESET);
        int days = sc.nextInt();

        double change = currentWeight - Login.calculator.weight;

        System.out.println(colors.YELLOW_BOLD + "\n------ Report Summary ------" + colors.RESET);

        if(change < 0){
            System.out.println(colors.GREEN + "Great! You lost " + Math.abs(change) + " kg this week." + colors.RESET);
        }
        else if(change > 0){
            System.out.println(colors.RED + "You gained " + change + " kg this week." + colors.RESET);
        }
        else{
            System.out.println(colors.YELLOW + "Your weight stayed the same this week." + colors.RESET);
        }

        System.out.println(colors.CYAN + "Workout days completed: " + days + "/7" + colors.RESET);

        if(days >= 5){
            System.out.println(colors.GREEN + "Excellent consistency! Keep it up 💪" + colors.RESET);
        }
        else{
            System.out.println(colors.RED + "Try to train at least 5 days next week." + colors.RESET);
        }
    }

    void FeatureAccess(){
        System.out.println(colors.PURPLE_BOLD + "======= PREMIUM ACCESS GRANTED ======" + colors.RESET);
    }

    public void bmi(){
        System.out.print(colors.CYAN + "Based on your BMI report " + colors.RESET);
        BMI bmi=new BMI();
        bmi.calculateBMI(Login.calculator.weight,Login.calculator.height);
    }
}

public class premium {

    public void premiumUser(){

        access a = new access();
        a.FeatureAccess();
        a.bmi();

        java.util.Scanner sc=new java.util.Scanner(System.in);

        System.out.println(colors.GREEN_BOLD + "\n------ Premium Services ------" + colors.RESET);

        System.out.println(colors.YELLOW + "1. Custom Workout" + colors.RESET);
        System.out.println(colors.YELLOW + "2. DietPlan" + colors.RESET);
        System.out.println(colors.YELLOW + "3. Weekly Report" + colors.RESET);
        System.out.println(colors.YELLOW + "4. Injury safe Workouts" + colors.RESET);

        System.out.print(colors.BLUE + "Enter Choice: " + colors.RESET);
        int ch = sc.nextInt();

        switch(ch){
            case 1:
                a.customizedworkout();
                break;
            case 2:
                DietPlan d = new DietPlan();
                d.startDietModule(true);
                break;
            case 3:
                a.weeklyreport();
                break;
            case 4:
                a.Injurysafeworkout();
                break;
            default:
                System.out.println(colors.RED + "Invalid option" + colors.RESET);
        }
    }
}