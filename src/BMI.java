public class BMI {

    public void  BMI(double height,double weight){

        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);
        if(bmi < 18.5)
            System.out.println("Category: Underweight");
        else if(bmi < 25)
            System.out.println("Category: Normal Weight");
        else if(bmi < 30)
            System.out.println("Category: Overweight");
        else
            System.out.println("Category: Obese");


        //THIS IS BMI MODULE

    }
}
