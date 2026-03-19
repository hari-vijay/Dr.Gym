public class BMI {

    public double calculateBMI(double weight, double height){

        double bmi = weight / (height * height);

        System.out.println(colors.CYAN_BOLD + "\n===== BMI RESULT =====" + colors.RESET);

        System.out.printf(colors.YELLOW + "Your BMI is: %.2f" + colors.RESET , bmi);
        System.out.println();

        if(bmi < 18.5)
            System.out.println(colors.YELLOW + "Category: Underweight ⚠" + colors.RESET);
        else if(bmi < 25)
            System.out.println(colors.GREEN + "Category: Normal Weight 💪" + colors.RESET);
        else if(bmi < 30)
            System.out.println(colors.RED + "Category: Overweight ❗" + colors.RESET);
        else
            System.out.println(colors.RED_BOLD + "Category: Obese 🚨" + colors.RESET);

        return bmi;
    }
}