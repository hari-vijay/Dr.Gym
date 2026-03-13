import java.util.Scanner;

public class normaldiet {

    public void normaldiet(){

        Scanner sc = new Scanner(System.in);

        System.out.println("\n------ Normal Diet Plan ------");

        System.out.println("Enter your weight (kg):");
        double weight = sc.nextDouble();

        double maintenanceCalories = weight * 30;

        System.out.println("\nRecommended Daily Calories : " + (int)maintenanceCalories + " kcal");

        // Meal calorie split
        int breakfast = (int)(maintenanceCalories * 0.25);
        int lunch = (int)(maintenanceCalories * 0.35);
        int snack = (int)(maintenanceCalories * 0.15);
        int dinner = (int)(maintenanceCalories * 0.25);

        System.out.println("\nSelect Diet Type");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");

        int choice = sc.nextInt();

        if(choice == 1){

            System.out.println("\n--- Veg Diet Suggestion ---");

            System.out.println("Breakfast ("+breakfast+" kcal) : Oats + Milk + Banana");
            System.out.println("Lunch ("+lunch+" kcal) : Rice + Dal + Vegetables + Curd");
            System.out.println("Snack ("+snack+" kcal) : Almonds / Peanut Butter / Fruit");
            System.out.println("Dinner ("+dinner+" kcal) : Chapati + Paneer / Soya Chunks + Salad");

        }

        else if(choice == 2){

            System.out.println("\n--- Non-Veg Diet Suggestion ---");

            System.out.println("Breakfast ("+breakfast+" kcal) : Eggs + Banana + Milk");
            System.out.println("Lunch ("+lunch+" kcal) : Chicken + Rice + Vegetables");
            System.out.println("Snack ("+snack+" kcal) : Peanut Butter / Nuts / Fruit");
            System.out.println("Dinner ("+dinner+" kcal) : Fish / Chicken + Chapati + Salad");

        }

        else{

            System.out.println("Invalid choice");

        }

        System.out.println("\nStay consistent with your diet and exercise!");
    }
}
