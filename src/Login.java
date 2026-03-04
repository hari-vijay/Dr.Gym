import java.util.Scanner;
import java.util.Random;
public class Login {

    public boolean login() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int pcount=0;
        String phno="";
        while(pcount<3) {
            System.out.println("enter the mobile number");
            phno = sc.nextLine();
            if (phno.length()== 10) {
                break;
            }
            else{
                pcount++;
                }
            }
        if(pcount==3){
            System.out.println("------Please Re-Login----------");
            return false;

        }
        System.out.println("Enter the Gender : ");
        char G = sc.next().charAt(0);
        G = Character.toUpperCase(G);
        if (G != 'M' && G != 'F') {
            System.out.println("Invalid Gender");
            return false;
        }
        int otp = 1000 + r.nextInt(9000);
        System.out.println("yours OTP is : " + otp);

        int count = 0;
        while (count < 3) {
            System.out.println("Enter your OTP ");
            int userotp = sc.nextInt();
            if (userotp == otp) {
                if (G == 'M') {
                    System.out.println("Login Successfull Sir");
                } else if (G == 'F') {
                    System.out.println("Login Successfull Mam");
                }
                return true;
            } else {
                count++;
                System.out.println("Login Failed!");
            }
        }
        System.out.println("Too many attempts ");
        return false;
    }
}

