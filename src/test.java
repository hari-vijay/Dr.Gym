
    import java.sql.Connection;
import java.sql.DriverManager;

    public class test {

        public static void main(String[] args) {

            try {

                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/gymfreak",
                        "root",
                        "123root123"   // your mysql password
                );

                System.out.println("Database Connected Successfully!");

            } catch (Exception e) {

                System.out.println(e);

            }

        }
    }

