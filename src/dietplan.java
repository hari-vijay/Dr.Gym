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
        return name+" (Cal:"+calories+" P:"+protein+" C:"+carbs+" F:"+fats+")";
    }
}


// Food database
class FoodDatabase{

    static List<Food> vegFoods(){

        return Arrays.asList(

                new Food("Oats",150,5,27,3),
                new Food("Milk",120,8,12,5),
                new Food("Paneer",265,18,4,20),
                new Food("Soya Chunks",345,52,33,1),
                new Food("Rice",200,4,45,1),
                new Food("Chapati",120,3,20,2),
                new Food("Dal",180,12,30,2),
                new Food("Peanut Butter",180,8,6,15),
                new Food("Banana",100,1,27,0),
                new Food("Apple",95,0,25,0),
                new Food("Broccoli",55,4,11,1),
                new Food("Spinach",40,3,6,0),
                new Food("Almonds",160,6,6,14),
                new Food("Walnuts",185,4,4,18)

        );
    }

    static List<Food> nonVegFoods(){

        return Arrays.asList(

                new Food("Eggs",155,13,1,11),
                new Food("Chicken Breast",165,31,0,3),
                new Food("Fish",206,22,0,12),
                new Food("Mutton",294,25,0,21),
                new Food("Prawns",99,24,0,1),
                new Food("Chicken Liver",167,24,1,5),
                new Food("Rice",200,4,45,1),
                new Food("Chapati",120,3,20,2),
                new Food("Banana",100,1,27,0),
                new Food("Milk",120,8,12,5),
                new Food("Peanut Butter",180,8,6,15)

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

        System.out.println("\nMacro Targets");

        System.out.println("Protein : "+protein+" g");
        System.out.println("Carbs   : "+carbs+" g");
        System.out.println("Fats    : "+fats+" g");
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

        for(Food f:plan)
            System.out.println(f);

        System.out.println("\nTotal Calories : "+total);

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

        int total = 0;

        for (Food f : diet) {

            System.out.println(f);
            total += f.calories;
        }

        System.out.println("Total Calories : " + total);
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

    void startDietModule(){

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        System.out.println("Enter Weight:");
        double weight = sc.nextDouble();

        System.out.println("Select Goal");
        System.out.println("1 Weight Loss");
        System.out.println("2 Maintain");
        System.out.println("3 Weight Gain");

        int goal = sc.nextInt();

        System.out.println("Select Diet Type");
        System.out.println("1 Veg");
        System.out.println("2 NonVeg");

        boolean veg = sc.nextInt() == 1;

        System.out.println("Premium User? true/false");

        boolean premium = sc.nextBoolean();

        createDiet(age,weight,goal,veg,premium);
    }

    void createDiet(int age,double weight,int goal,
                    boolean veg,boolean premium){

        AgePlanner planner=new AgePlanner();

        String planType=planner.getPlan(age);

        System.out.println("\nPlan Type : "+planType);

        CalorieService cal=new CalorieService();

        double maintenance=cal.maintenanceCalories(weight);

        System.out.println("\nMaintenance Calories : "+(int)maintenance);

        GoalService goalService=new GoalService();

        double target=goalService.adjustCalories(maintenance,goal);

        System.out.println("Target Calories : "+(int)target);

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


