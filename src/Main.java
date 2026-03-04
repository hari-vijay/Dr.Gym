public class Main {

    public static void main(String[] args) {
        Login log = new Login();
        boolean result = log.login();
        if(result){
            System.out.println("Welcome to Dr Gym");
        }
        else{
            System.out.println("");
        }

    }
}