public class AI {

    public void AIBOT(){

        java.util.Scanner sc=new java.util.Scanner(System.in);

        String question;
        System.out.println(colors.YELLOW_BOLD+ "===== GYMFREAK AI ASSISTANT =====" + colors.RESET);
        System.out.println("Hello! Ask me anything about fitness.");
        System.out.println("Type "+colors.RED+"exit"+colors.RESET+" to return to menu.\n");

        while(true){
            System.out.print("You: ");
            question = sc.nextLine().toLowerCase();

            if(question.equals("exit")) {
                System.out.println(colors.RED+ "Exiting AI Assistant..." + colors.RESET);
                break;
            }
            if(question.contains("lose")||question.contains("weight loss")||question.contains("fat loss")){
                System.out.println(colors.CYAN+"AI : To lose weight maintain calorie deficit and do cardio exercises."+colors.RESET);
            }
            else if(question.contains("hi") || question.contains("hello")){
                System.out.println(colors.CYAN+
                        "AI: Hello! Ask me anything about fitness."+colors.RESET);
            }
            else if(question.contains("kg")&&question.contains("protein")){
                System.out.println(colors.PURPLE+"Enter your weight"+colors.RESET);
                int weight=sc.nextInt();
                sc.nextLine();
                if(weight > 0){
                    double protein = weight * 1.6;
                    System.out.println(colors.CYAN +
                            "AI: Your daily protein intake should be around " + protein + " grams." + colors.RESET);
                }
                else{
                    System.out.println(colors.RED + "Enter a valid weight." + colors.RESET);
                }
            }
            else if(question.contains("gain")||question.contains("build muscle")||question.contains("bulk")){
                System.out.println(colors.CYAN+"AI : To gain weight maintain above the maintenance and do Strength exercises."+colors.RESET);
            }
            else if(question.contains("protein")||question.contains("protein intake")||question.contains("protein food")) {
                System.out.println(colors.CYAN + "AI: Protein rich foods include eggs, chicken, paneer and lentils." + colors.RESET);
            }
            else if(question.contains("water")||question.contains("hydration")||question.contains("drink water")){
                System.out.println(colors.CYAN+"AI: Drink at least 3 to 4 liters of water daily to stay hydrated and maintain metabolism."+colors.RESET);
            }
            else if(question.contains("sleep")||question.contains("recover")||question.contains("rest")){
                System.out.println(colors.CYAN+"AI: Proper sleep of 7–8 hours is essential for muscle recovery and hormone balance."+colors.RESET);
            }
            else if(question.contains("supplements")||question.contains("protein powder")||question.contains("creatine")){
                System.out.println(colors.CYAN+"AI: Supplements like whey protein and creatine can support training but natural foods are best."+colors.RESET);
            }
            else if(question.contains("muscle")) {
                System.out.println(colors.CYAN + "AI: For muscle gain eat high protein diet and do strength training." + colors.RESET);
            }

            else if(question.contains("cardio")||question.contains("cardio exercise")){
                System.out.println(colors.CYAN+"AI: Cardio exercises include running, cycling jump rope and brisk walking."+colors.RESET);
            }
            else if(question.contains("bmi")||question.contains("body mass index")){
                System.out.println(colors.CYAN+"AI: BMI stands for Body Mass Index It measures body fat based on height and weight."+colors.RESET);
            }
            else if(question.contains("injury")||question.contains("knee pain")||question.contains("back pain")){
                System.out.println(colors.CYAN+"AI: If you have an injury avoid heavy exercises and consult a trainer before continuing workouts."+colors.RESET);
            }
            else if(question.contains("workout")||question.contains("first workout")||question.contains("start gym")) {
                System.out.println("1.Beginner");
                System.out.println("2.Intermediate");
                System.out.println("3.Advance");
                System.out.println("Enter your Choice");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println(colors.CYAN + "AI: Beginners can start with pushups, squats and light cardio." + colors.RESET);
                        break;
                    case 2:
                        System.out.println(colors.CYAN + "AI:  Intermediate can proceed with split ." + colors.RESET);
                        System.out.println(colors.YELLOW+"CHEST "+colors.RESET);
                        System.out.println(colors.YELLOW+"BACK "+colors.RESET);
                        System.out.println(colors.YELLOW+"SHOULDERS "+colors.RESET);
                        System.out.println(colors.YELLOW+"LEGS"+colors.RESET);
                        System.out.println(colors.YELLOW+"ARMS"+colors.RESET);
                        break;
                    case 3:
                        System.out.println(colors.CYAN + "AI: Advance  can proceed with split ." + colors.RESET);
                        System.out.println(colors.YELLOW+"CHEST AND TRICEP"+colors.RESET);
                        System.out.println(colors.YELLOW+"BACK AND BICEPS"+colors.RESET);
                        System.out.println(colors.YELLOW+"SHOULDERS AND ARMS"+colors.RESET);
                        System.out.println(colors.YELLOW+"LEGS"+colors.RESET);
                        System.out.println(colors.YELLOW+"REPEAT"+colors.RESET);
                        break;
                    default:
                        System.out.println("Please Choose the correct option bro");
                        break;
                }
            }
            else if(question.contains("diet")){
                System.out.println(colors.CYAN + "AI: For Diet please return to main menu and find the suitable option." + colors.RESET);
            }
            else if(question.contains("warmup")||question.contains("warm up")){
                System.out.println(colors.CYAN+"AI: Always start workouts with warm-up exercises like jumping jacks, stretching and light jogging."+colors.RESET);
            }
            else if(question.contains("stretch")||question.contains("stretching")){
                System.out.println(colors.CYAN+"AI: Stretching helps improve flexibility and prevents injuries during workouts."+colors.RESET);
            }
            else if(question.contains("abs")||question.contains("core")){
                System.out.println(colors.CYAN+"AI: Good core exercises include planks, crunches, leg raises and mountain climbers."+colors.RESET);
            }
            else if(question.contains("chest")){
                System.out.println(colors.CYAN+"AI: Chest exercises include bench press, pushups, chest fly and incline press."+colors.RESET);
            }
            else if(question.contains("back workout")||question.contains("back exercise")){
                System.out.println(colors.CYAN+"AI: Back exercises include pull-ups, lat pulldown, seated rows and deadlifts."+colors.RESET);
            }
            else if(question.contains("leg")||question.contains("legs workout")){
                System.out.println(colors.CYAN+"AI: Leg exercises include squats, lunges, leg press and calf raises."+colors.RESET);
            }
            else if(question.contains("fat burning")||question.contains("fat burn food")){
                System.out.println(colors.CYAN+"AI: Foods like green tea, oats, eggs, chicken and vegetables help in fat loss."+colors.RESET);
            }
            else if(question.contains("motivation")||question.contains("motivate")){
                System.out.println(colors.CYAN+"AI: Stay consistent bro! Small progress every day leads to big transformation."+colors.RESET);
            }
            else if(question.contains("how many days gym")||question.contains("gym frequency")){
                System.out.println(colors.CYAN+"AI: Beginners can train 3-4 days per week and gradually increase intensity."+colors.RESET);
            }
            else if(question.contains("gym mistakes")||question.contains("beginner mistakes")){
                System.out.println(colors.CYAN+"AI: Avoid ego lifting, maintain proper form and follow a balanced diet."+colors.RESET);
            }
            else{
                System.out.println(colors.RED+"AI: Sorry bro, I don't understand that question yet."+colors.RESET);
            }
        }
    }
}
