


interface PremiumFeatures {

    void customizedworkout();
    void weeklyreport();

    void Injurysafeworkout();
    void bmi();
}
       abstract class  PremiumUser{
            abstract void FeatureAccess();
        }
        class access extends PremiumUser implements PremiumFeatures{
            public void customizedworkout(){
                    java.util.Scanner sc = new java.util.Scanner(System.in);

                    System.out.println("Please Choose your Goal Based on BMI ");
                    System.out.println("1 Weight Loss");
                    System.out.println("2 Muscle Gain");
                    System.out.println("3 General Fitness");
                    int goal = sc.nextInt();
                    switch(goal){
                        case 1:
                            System.out.println("------ Weight Loss Workout ------");
                            System.out.println("1.Beginner");
                            System.out.println("2.Intermediate");
                            System.out.println("3.Advance");
                            int op=sc.nextInt();
                            switch(op) {
                                case 1:
                                System.out.println("Running - 20 min");
                                System.out.println("Jump Rope - 10 min");
                                System.out.println("Cycling - 15 min");
                                break;
                                case 2:
                                    System.out.println("Running - 20 min x 3/7 Days");
                                    System.out.println("Jump Rope - 10 min x 3/7 Days");
                                    System.out.println("Cycling - 15 min x 3/7 Days");
                                    System.out.println("Strength Traing 3x days a week");
                                    break;
                                case 3:
                                    System.out.println("Running - 20 min");
                                    System.out.println("Jump Rope - 10 min");
                                    System.out.println("Cycling - 15 min");
                                    System.out.println("Strength Traing 6x days a week");
                                System.out.println("Day 1 : Chest + Triceps");
                                System.out.println("Day 2 : Back + Biceps");
                                System.out.println("Day 3 : Legs,");
                                System.out.println("Day 4 : Shoulders");
                                System.out.println("Day 5 : Cardio + Abs");
                                break;
                                default:
                                    System.out.println("invalid option");
                                    break;
                            }
                            break;
                        case 2:

                            System.out.println("------ Muscle Gain Workout ------");
                            System.out.println("1.Beginner");
                            System.out.println("2.Intermediate");
                            System.out.println("3.Advance");
                            int op2=sc.nextInt();
                            switch(op2) {
                                case 1:
                                System.out.println("Low Weighted Bench Press");
                                    System.out.println("Push Ups");
                                System.out.println("Pull Ups");
                                break;
                                case 2:
                                    System.out.println("Low Weighted Bench Press");
                                    System.out.println("Low weight Deadlift");
                                    System.out.println("Low weight Squats");
                                    System.out.println("Push Ups");
                                    System.out.println("Pull Ups");
                                break;
                                case 3:
                                    System.out.println("Push Ups");
                                    System.out.println("Pull Ups");
                                    System.out.println("Strength Traing 6x days a week");
                                System.out.println("Day 1 : Chest + Triceps");
                                System.out.println("Day 2 : Back + Biceps");
                                System.out.println("Day 3 : Legs,");
                                System.out.println("Day 4 : Shoulders");
                                System.out.println("Day 5 : Cardio + Abs");
                                break;
                            }
                            break;
                        case 3:
                            System.out.println("------ Fitness Workout ------");
                            System.out.println("1.Beginner");
                            System.out.println("2.Intermediate");
                            System.out.println("3.Advance");
                            int op3=sc.nextInt();
                            switch(op3) {
                                case 1:
                                    System.out.println("Running - 20 min");
                                    System.out.println("Jump Rope - 10 min");
                                    System.out.println("Cycling - 15 min");
                                    break;
                                case 2:
                                System.out.println("Push Ups");
                                System.out.println("Squats");
                                System.out.println("Plank");
                                System.out.println("Running - 20 min");
                                System.out.println("Strength Traing 6x days a week");
                                break;
                                case 3:
                                    System.out.println("Push Ups");
                                    System.out.println("Squats");
                                    System.out.println("Plank");
                                    System.out.println("Running - 20 min");
                                System.out.println("Day 1 : Chest + Triceps");
                                System.out.println("Day 2 : Back + Biceps");
                                System.out.println("Day 3 : Legs,");
                                System.out.println("Day 4 : Shoulders");
                                System.out.println("Day 5 : Cardio + Abs");
                                    System.out.println("Strength Traing 6x days a week");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid Goal");
                            break;
                    }

                }

                public void Injurysafeworkout(){
                    java.util.Scanner sc = new java.util.Scanner(System.in);
                    System.out.println("Do you have any injury? (yes/no)");
                    String injury = sc.next();
                    if(injury.equalsIgnoreCase("yes")) {
                        System.out.println("Do's");
                        System.out.println(" 1.cardio\n 2.strechings\n 3.mobility workouts\n 4.lite weights");
                        System.out.println("Don't");
                        System.out.println(" 1.Heavy weights\n 2.Long training\n 3.Heavy Squats");
                    }
                    else{
                        System.out.println("I'm Happy to hear that continue with other options");
                        }

                }
            public void weeklyreport(){
                    java.util.Scanner sc = new java.util.Scanner(System.in);

                    System.out.println("------ Weekly Fitness Report ------");

                    System.out.print("Enter your starting weight (kg): ");
                    double startWeight = sc.nextDouble();

                    System.out.print("Enter your current weight (kg): ");
                    double currentWeight = sc.nextDouble();

                    System.out.print("How many days did you workout this week? ");
                    int days = sc.nextInt();
                    double change = currentWeight - startWeight;
                    System.out.println("\n------ Report Summary ------");
                    if(change < 0){
                        System.out.println("Great! You lost " + Math.abs(change) + " kg this week.");
                    }
                    else if(change > 0){
                        System.out.println("You gained " + change + " kg this week.");
                    }
                    else{
                        System.out.println("Your weight stayed the same this week.");
                    }
                    System.out.println("Workout days completed: " + days + "/7");
                    if(days >= 5){
                        System.out.println("Excellent consistency! Keep it up 💪");
                    }
                    else{
                        System.out.println("Try to train at least 5 days next week.");
                    }
            }

            void FeatureAccess(){
                System.out.println(colors.YELLOW_BOLD+"=======PREMIUM ACCESS GARNTED======"+colors.RESET);
            }
         public  void bmi(){
             System.out.print("Based on your BMI report ");
             BMI bmi=new BMI();
             bmi.calculateBMI(70,6.0);
            }
        }
        public class premium {
            public void premiumUser(){
                access a = new access();
                a.FeatureAccess();
                a.bmi();
                java.util.Scanner sc=new java.util.Scanner(System.in);
                System.out.println(colors.GREEN_BOLD+"------ Premium Services ------"+colors.RESET);
                System.out.println("1. Custom Workout");
                System.out.println("2. Weekly Report");
                System.out.println("3. Injury safe Workouts");
                int ch = sc.nextInt();
                switch(ch){
                    case 1:
                        a.customizedworkout();
                        break;
                    case 2:
                        a.weeklyreport();
                        break;
                    case 3:
                        a.Injurysafeworkout();
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }

        }

