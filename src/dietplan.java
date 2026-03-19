import java.util.*;

// Food model
class Food {

    String name;
    int calories;
    int protein;
    int carbs;
    int fats;

    Food(String name,int calories,int protein,int carbs,int fats){
        this.name=name;
        this.calories=calories;
        this.protein=protein;
        this.carbs=carbs;
        this.fats=fats;
    }

    public String toString(){
        return colors.GREEN + name+" (Cal:"+calories+" P:"+protein+" C:"+carbs+" F:"+fats+")" + colors.RESET;
    }
}


// Food database
class FoodDatabase{

    static List<Food> vegFoods(){

        return Arrays.asList(

                // Grains & carbs
                new Food("Oats",150,5,27,3),
                new Food("Brown Rice",215,5,45,2),
                new Food("White Rice",200,4,45,1),
                new Food("Quinoa",220,8,39,3),
                new Food("Chapati",120,3,20,2),
                new Food("Sweet Potato",180,4,41,0),

                // Dairy
                new Food("Milk",120,8,12,5),
                new Food("Curd",98,11,3,4),
                new Food("Paneer",265,18,4,20),
                new Food("Greek Yogurt",100,10,4,0),

                // Protein (veg)
                new Food("Soya Chunks",345,52,33,1),
                new Food("Tofu",144,15,3,9),
                new Food("Lentils",230,18,40,1),
                new Food("Chickpeas",210,12,35,3),
                new Food("Rajma",225,15,40,1),

                // Fruits
                new Food("Banana",100,1,27,0),
                new Food("Apple",95,0,25,0),
                new Food("Orange",80,1,20,0),
                new Food("Mango",150,1,35,0),
                new Food("Papaya",60,1,15,0),

                // Vegetables
                new Food("Broccoli",55,4,11,1),
                new Food("Spinach",40,3,6,0),
                new Food("Carrot",50,1,12,0),
                new Food("Beans",70,3,15,0),
                new Food("Cauliflower",60,4,12,1),

                // Nuts & fats
                new Food("Almonds",160,6,6,14),
                new Food("Walnuts",185,4,4,18),
                new Food("Cashews",155,5,9,12),
                new Food("Peanut Butter",180,8,6,15),
                new Food("Flax Seeds",110,4,6,8),
                new Food("Chia Seeds",120,5,10,7)

        );
    }

    static List<Food> nonVegFoods(){

        return Arrays.asList(

                // Veg base (same as veg list)
                new Food("Oats",150,5,27,3),
                new Food("Brown Rice",215,5,45,2),
                new Food("White Rice",200,4,45,1),
                new Food("Chapati",120,3,20,2),
                new Food("Milk",120,8,12,5),
                new Food("Curd",98,11,3,4),
                new Food("Paneer",265,18,4,20),
                new Food("Soya Chunks",345,52,33,1),
                new Food("Banana",100,1,27,0),
                new Food("Apple",95,0,25,0),
                new Food("Broccoli",55,4,11,1),
                new Food("Spinach",40,3,6,0),
                new Food("Almonds",160,6,6,14),
                new Food("Peanut Butter",180,8,6,15),

                // Eggs
                new Food("Eggs",155,13,1,11),
                new Food("Boiled Eggs",140,12,1,10),
                new Food("Egg White",52,11,1,0),

                // Chicken
                new Food("Chicken Breast",165,31,0,3),
                new Food("Grilled Chicken",180,30,0,5),
                new Food("Chicken Curry",250,20,5,15),
                new Food("Chicken Liver",167,24,1,5),

                // Fish
                new Food("Fish",206,22,0,12),
                new Food("Tuna",132,28,0,1),
                new Food("Salmon",208,20,0,13),
                new Food("Prawns",99,24,0,1),

                // Red meat
                new Food("Mutton",294,25,0,21),
                new Food("Lean Beef",250,26,0,15),

                // Extra protein combos
                new Food("Chicken + Rice Combo",350,30,40,5),
                new Food("Egg + Chapati Combo",250,15,20,8),
                new Food("Fish + Rice Combo",300,25,35,6)

        );
    }
}

// Age planner
class AgePlanner{

    String getPlan(int age){

        if(age<=18)
            return "TEEN";

        else if(age<=50)
            return "ADULT";

        else
            return "SENIOR";
    }
}


// calorie calculator
class CalorieService{

    double maintenanceCalories(double weight){

        return weight*30;
    }
}


// goal adjustment
class GoalService{

    double adjustCalories(double maintenance,int goal){

        if(goal==1)
            return maintenance-500;

        else if(goal==3)
            return maintenance+500;

        return maintenance;
    }
}


// macro calculator
class mc{

    void calculate(double calories){

        int protein=(int)((calories*0.30)/4);
        int carbs=(int)((calories*0.40)/4);
        int fats=(int)((calories*0.30)/9);

        System.out.println(colors.CYAN_BOLD + "\n===== Macro Targets =====" + colors.RESET);
        System.out.println(colors.YELLOW + "Protein : "+protein+" g" + colors.RESET);
        System.out.println(colors.YELLOW + "Carbs   : "+carbs+" g" + colors.RESET);
        System.out.println(colors.YELLOW + "Fats    : "+fats+" g" + colors.RESET);
    }
}


// diet generator
class DietBuilder{

    List<Food> generateDiet(List<Food> foods,int targetCalories){

        List<Food> plan=new ArrayList<>();
        int total=0;

        for(Food f:foods){
            if(total+f.calories<=targetCalories){
                plan.add(f);
                total+=f.calories;
            }

            if(total>=targetCalories-50)
                break;
        }

        System.out.println("\nGenerated Diet");

        // SLOT CREATION
        List<Food> breakfast=new ArrayList<>();
        List<Food> lunch=new ArrayList<>();
        List<Food> snack=new ArrayList<>();
        List<Food> dinner=new ArrayList<>();

        for(int i=0;i<plan.size();i++){

            if(i%4==0)
                breakfast.add(plan.get(i));

            else if(i%4==1)
                lunch.add(plan.get(i));

            else if(i%4==2)
                snack.add(plan.get(i));

            else
                dinner.add(plan.get(i));
        }

        System.out.println(colors.YELLOW_BOLD + "\n🍳 Breakfast" + colors.RESET);
        for(Food f:breakfast) System.out.println(f);

        System.out.println(colors.YELLOW_BOLD + "\n🍛 Lunch" + colors.RESET);
        for(Food f:lunch) System.out.println(f);

        System.out.println(colors.YELLOW_BOLD + "\n🍿 Snack" + colors.RESET);
        for(Food f:snack) System.out.println(f);

        System.out.println(colors.YELLOW_BOLD + "\n🍽 Dinner" + colors.RESET);
        for(Food f:dinner) System.out.println(f);

        System.out.println(colors.GREEN_BOLD + "\nTotal Calories : "+total + colors.RESET);

        return plan;
    }
}


// customization
class PremiumCustomizer {

    Scanner sc = new Scanner(System.in);

    void customize(List<Food> diet, List<Food> foods) {

        System.out.println("\nDo you want customization?");
        System.out.println("1 Yes");
        System.out.println("2 No");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice != 1)
            return;

        System.out.println("How many foods you want to replace?");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {

            System.out.println("Enter food name to replace:");

            String dislike = sc.nextLine();

            replaceFood(diet, foods, dislike);
        }

        System.out.println("\nUpdated Diet");

        List<Food> breakfast=new ArrayList<>();
        List<Food> lunch=new ArrayList<>();
        List<Food> snack=new ArrayList<>();
        List<Food> dinner=new ArrayList<>();

        for(int i=0;i<diet.size();i++){

            if(i%4==0)
                breakfast.add(diet.get(i));

            else if(i%4==1)
                lunch.add(diet.get(i));

            else if(i%4==2)
                snack.add(diet.get(i));

            else
                dinner.add(diet.get(i));
        }



        int total=0;

        System.out.println("\nBreakfast");
        for(Food f:breakfast){
            System.out.println(f);
            total+=f.calories;
        }

        System.out.println("\nLunch");
        for(Food f:lunch){
            System.out.println(f);
            total+=f.calories;
        }

        System.out.println("\nSnack");
        for(Food f:snack){
            System.out.println(f);
            total+=f.calories;
        }

        System.out.println("\nDinner");
        for(Food f:dinner){
            System.out.println(f);
            total+=f.calories;
        }

        System.out.println("\nTotal Calories : "+total);

        }


    void replaceFood(List<Food> diet, List<Food> foods, String dislike) {

        boolean found = false;

        for (int i = 0; i < diet.size(); i++) {

            Food f = diet.get(i);

            if (f.name.equalsIgnoreCase(dislike)) {

                found = true;

                Food bestMatch = null;
                int bestScore = Integer.MAX_VALUE;

                for (Food alt : foods) {

                    if (!alt.name.equalsIgnoreCase(f.name)) {

                        int score = Math.abs(alt.calories - f.calories)
                                + Math.abs(alt.protein - f.protein);

                        if (score < bestScore) {

                            bestScore = score;
                            bestMatch = alt;
                        }
                    }
                }

                if (bestMatch != null) {

                    diet.set(i, bestMatch);

                    System.out.println(f.name + " replaced with " + bestMatch.name);
                    return;
                }
            }
        }

        if (!found)
            System.out.println("That food is not in your diet plan.");
    }
}



// diet planner
class DietPlan {

    Scanner sc = new Scanner(System.in);
    void startDietModule(boolean premium){

        int age = Login.calculator.age;
        double weight = Login.calculator.weight;
        System.out.println(colors.CYAN_BOLD + "===== DIET PLANNER =====" + colors.RESET);

        System.out.println(colors.YELLOW + "1 Weight Loss" + colors.RESET);
        System.out.println(colors.YELLOW + "2 Maintain" + colors.RESET);
        System.out.println(colors.YELLOW + "3 Weight Gain" + colors.RESET);

        int goal = sc.nextInt();

        System.out.println(colors.CYAN_BOLD +"Select Diet Type"+ colors.RESET);
        System.out.println(colors.YELLOW + "1 Veg" + colors.RESET);
        System.out.println(colors.YELLOW + "2 NonVeg" + colors.RESET);

        boolean veg = sc.nextInt() == 1;

        createDiet(age, weight, goal, veg, premium);
    }

    void createDiet(int age,double weight,int goal,
                    boolean veg,boolean premium){

        AgePlanner planner=new AgePlanner();

        String planType=planner.getPlan(age);

        System.out.println(colors.CYAN + "\nPlan Type : "+planner.getPlan(age) + colors.RESET);

        CalorieService cal=new CalorieService();

        double maintenance=cal.maintenanceCalories(weight);

        System.out.println(colors.CYAN + "\nPlan Type : "+planner.getPlan(age) + colors.RESET);

        GoalService goalService=new GoalService();

        double target=goalService.adjustCalories(maintenance,goal);

        System.out.println(colors.GREEN + "Target Calories : "+(int)target + colors.RESET);

        mc macro=new mc();

        macro.calculate(target);

        List<Food> foods;

        if(veg)
            foods=FoodDatabase.vegFoods();
        else
            foods=FoodDatabase.nonVegFoods();

        DietBuilder builder=new DietBuilder();

        List<Food> diet=builder.generateDiet(foods,(int)target);

        if(premium){

            PremiumCustomizer pc=new PremiumCustomizer();

            pc.customize(diet,foods);
        }
    }
}


