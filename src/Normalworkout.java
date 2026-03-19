interface features{
    void generalworkout();
}

abstract class User {
    abstract void featureAccess();
}

class normal extends User implements features{

    void featureAccess(){
        System.out.println(colors.CYAN_BOLD + "General Workout Plan 💪" + colors.RESET);
    }

    public void generalworkout() {

        System.out.println(colors.YELLOW_BOLD + "\n--- Cardio Section ---" + colors.RESET);
        System.out.println(colors.GREEN + "Cardio\n Cycling \n Elliptical \n Walking" + colors.RESET);

        System.out.println(colors.YELLOW_BOLD + "\n--- Weekly Workout Split ---" + colors.RESET);
        System.out.println(colors.GREEN + "Day 1 : Chest + Triceps" + colors.RESET);
        System.out.println(colors.GREEN + "Day 2 : Back + Biceps" + colors.RESET);
        System.out.println(colors.GREEN + "Day 3 : Legs" + colors.RESET);
        System.out.println(colors.GREEN + "Day 4 : Shoulders" + colors.RESET);
        System.out.println(colors.GREEN + "Day 5 : Cardio + Abs" + colors.RESET);

        System.out.println(colors.PURPLE_BOLD + "\nStrength Training 6x days a week 🔥" + colors.RESET);
    }
}

public class Normalworkout {
    public void NormalFeatures(){

        normal n = new normal();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        n.featureAccess();
        n.generalworkout();
    }
}