public class BMI {

    public double calculateBMI(double weight, double height){

        double bmi = weight / (height * height);

        System.out.printf(" Your BMI is: %.2f" , bmi);
        System.out.println();
        if(bmi < 18.5)
            System.out.println("Category: Underweight");
        else if(bmi < 25)
            System.out.println("Category: Normal Weight");
        else if(bmi < 30)
            System.out.println("Category: Overweight");
        else
            System.out.println("Category: Obese");
        return bmi;
    }
}