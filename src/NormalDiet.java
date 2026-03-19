import java.util.Scanner;

public class NormalDiet {

    public void normaldiet(){

        Scanner sc = new Scanner(System.in);

        System.out.println(colors.CYAN_BOLD + "\n------ Normal Diet Plan ------" + colors.RESET);

        double weight = Login.calculator.weight;

        double maintenanceCalories = weight * 30;

        System.out.println(colors.GREEN + "\nRecommended Daily Calories : " + (int)maintenanceCalories + " kcal" + colors.RESET);

        // Meal calorie split
        int breakfast = (int)(maintenanceCalories * 0.25);
        int lunch = (int)(maintenanceCalories * 0.35);
        int snack = (int)(maintenanceCalories * 0.15);
        int dinner = (int)(maintenanceCalories * 0.25);

        System.out.println(colors.YELLOW_BOLD + "\nSelect Diet Type" + colors.RESET);
        System.out.println(colors.YELLOW + "1. Veg" + colors.RESET);
        System.out.println(colors.YELLOW + "2. Non-Veg" + colors.RESET);

        int choice = sc.nextInt();

        if(choice == 1){

            System.out.println(colors.CYAN + "\n--- Veg Diet Suggestion ---" + colors.RESET);

            System.out.println(colors.GREEN + "Breakfast ("+breakfast+" kcal) : Oats + Milk + Banana" + colors.RESET);
            System.out.println(colors.GREEN + "Lunch ("+lunch+" kcal) : Rice + Dal + Vegetables + Curd" + colors.RESET);
            System.out.println(colors.GREEN + "Snack ("+snack+" kcal) : Almonds / Peanut Butter / Fruit" + colors.RESET);
            System.out.println(colors.GREEN + "Dinner ("+dinner+" kcal) : Chapati + Paneer / Soya Chunks + Salad" + colors.RESET);

        }

        else if(choice == 2){

            System.out.println(colors.CYAN + "\n--- Non-Veg Diet Suggestion ---" + colors.RESET);

            System.out.println(colors.GREEN + "Breakfast ("+breakfast+" kcal) : Eggs + Banana + Milk" + colors.RESET);
            System.out.println(colors.GREEN + "Lunch ("+lunch+" kcal) : Chicken + Rice + Vegetables" + colors.RESET);
            System.out.println(colors.GREEN + "Snack ("+snack+" kcal) : Peanut Butter / Nuts / Fruit" + colors.RESET);
            System.out.println(colors.GREEN + "Dinner ("+dinner+" kcal) : Fish / Chicken + Chapati + Salad" + colors.RESET);

        }

        else{

            System.out.println(colors.RED + "Invalid choice" + colors.RESET);

        }

        System.out.println(colors.PURPLE_BOLD + "\nStay consistent with your diet and exercise! 💪" + colors.RESET);
    }
}