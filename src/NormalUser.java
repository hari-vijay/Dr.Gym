
interface features{
    void generalworkout();
    void generalDiet();
}
abstract class User {

    abstract void featureAccess();

}
class normal extends User implements features{

    void featureAccess(){
        System.out.println(colors.YELLOW_BOLD+"======GENERAL FEATURES========="+colors.RESET);
    }
    public void generalDiet() {
        System.out.println("which ");
    }

    public void generalworkout() {
       // System.out.println("Cardio\n Cycling \n Elliptical \n Walking");
        System.out.println("Day 1 : Chest + Triceps");
        System.out.println("Day 2 : Back + Biceps");
        System.out.println("Day 3 : Legs,");
        System.out.println("Day 4 : Shoulders");
        System.out.println("Day 5 : Cardio + Abs");
        System.out.println("Strength Traing 6x days a week");
    }
}
public class NormalUser {
    public void NormalFeatures(){
        normal n=new normal();
        java.util.Scanner sc=new java.util.Scanner(System.in);
        n.featureAccess();
        System.out.println("1.General WorkoutPlan");
        System.out.println("2.General DietPlan");
        int cho=sc.nextInt();
        switch (cho){
            case 1:
                n.generalworkout();
                break;
            case 2:
                n.generalDiet();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}