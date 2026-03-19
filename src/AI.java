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
                if(Login.calculator.weight> 0){
                    double protein = Login.calculator.weight * 1.6;
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
            else if(question.contains("calories") || question.contains("daily calories")){
                System.out.println(colors.CYAN+"AI: Your daily calories depend on your goal. Maintenance = weight x 30 approx."+colors.RESET);
            }

            else if(question.contains("weight gain diet")){
                System.out.println(colors.CYAN+"AI: For weight gain eat calorie surplus foods like rice, chicken, eggs, nuts."+colors.RESET);
            }

            else if(question.contains("six pack") || question.contains("abs visible")){
                System.out.println(colors.CYAN+"AI: For six pack reduce body fat % and train abs regularly."+colors.RESET);
            }

            else if(question.contains("body fat") || question.contains("fat percent")){
                System.out.println(colors.CYAN+"AI: Healthy body fat is 10-18% for men and 18-25% for women."+colors.RESET);
            }

            else if(question.contains("pre workout")){
                System.out.println(colors.CYAN+"AI: Eat banana, coffee or oats before workout for energy."+colors.RESET);
            }

            else if(question.contains("post workout")){
                System.out.println(colors.CYAN+"AI: Post workout take protein + carbs like eggs, chicken, rice."+colors.RESET);
            }

            else if(question.contains("home workout")){
                System.out.println(colors.CYAN+"AI: You can do pushups, squats, planks, jumping jacks at home."+colors.RESET);
            }

            else if(question.contains("best time gym") || question.contains("gym time")){
                System.out.println(colors.CYAN+"AI: Best time is when you are consistent morning or evening both are fine."+colors.RESET);
            }

            else if(question.contains("fasting") || question.contains("intermittent fasting")){
                System.out.println(colors.CYAN+"AI: Intermittent fasting helps fat loss but total calories matter more."+colors.RESET);
            }

            else if(question.contains("cheat meal")){
                System.out.println(colors.CYAN+"AI: 1 cheat meal per week is fine but don't overeat."+colors.RESET);
            }

            else if(question.contains("water before workout")){
                System.out.println(colors.CYAN+"AI: Drink water before and during workout to stay hydrated."+colors.RESET);
            }

            else if(question.contains("is whey safe") || question.contains("protein powder safe")){
                System.out.println(colors.CYAN+"AI: Yes whey protein is safe if used in proper quantity."+colors.RESET);
            }

            else if(question.contains("how much protein")){
                System.out.println(colors.CYAN+"AI: Take 1.2g to 1.6g protein per kg body weight."+colors.RESET);
            }

            else if(question.contains("bulking") || question.contains("cutting")){
                System.out.println(colors.CYAN+"AI: Bulking = calorie surplus, Cutting = calorie deficit."+colors.RESET);
            }

            else if(question.contains("how long weight loss")){
                System.out.println(colors.CYAN+"AI: Healthy fat loss is 0.5 to 1 kg per week."+colors.RESET);
            }

            else if(question.contains("sugar") || question.contains("avoid sugar")){
                System.out.println(colors.CYAN+"AI: Reduce sugar intake to avoid fat gain and energy crashes."+colors.RESET);
            }

            else if(question.contains("junk food")){
                System.out.println(colors.CYAN+"AI: Avoid junk food like pizza, burgers and fried items."+colors.RESET);
            }

            else if(question.contains("cardio vs weight")){
                System.out.println(colors.CYAN+"AI: Best results come from combining both cardio and strength training."+colors.RESET);
            }

            else if(question.contains("run daily") || question.contains("running daily")){
                System.out.println(colors.CYAN+"AI: Yes but avoid overtraining mix rest days also."+colors.RESET);
            }

            else if(question.contains("first day gym")){
                System.out.println(colors.CYAN+"AI: Start light, learn form and don't lift heavy weights."+colors.RESET);
            }
            else if(question.contains("increase height")){
                System.out.println(colors.CYAN+"AI: Height depends on genetics but posture and stretching help."+colors.RESET);
            }

            else if(question.contains("belly fat")){
                System.out.println(colors.CYAN+"AI: You cannot spot reduce fat focus on overall fat loss."+colors.RESET);
            }

            else if(question.contains("veg protein")){
                System.out.println(colors.CYAN+"AI: Veg protein sources: paneer, tofu, soya chunks, lentils."+colors.RESET);
            }

            else if(question.contains("low energy") || question.contains("tired")){
                System.out.println(colors.CYAN+"AI: Eat balanced meals and get proper sleep."+colors.RESET);
            }


            else if(question.contains("gym without diet")){
                System.out.println(colors.CYAN+"AI: Diet is 70% and workout is 30% for results."+colors.RESET);
            }


            else if(question.contains("stamina")){
                System.out.println(colors.CYAN+"AI: Improve stamina with cardio and endurance training."+colors.RESET);
            }


            else if(question.contains("protein after gym")){
                System.out.println(colors.CYAN+"AI: Yes protein after workout helps muscle recovery."+colors.RESET);
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
                System.out.println(colors.RED+"AI: Sorry , I don't understand that question yet."+colors.RESET);
            }
        }
    }
}
