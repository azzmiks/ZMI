package learningJava.manipulatingData;

/**
 * Created by azmiks on 14/02/2017.
 */
public class L35_StringComparison {
    public static void main(String[] args) {

        String password = "bingo";
        String pass = "BINGO";

        try {
            if (pass.toLowerCase().equals(password)) {
                System.out.println("Password is correct");
            }
            else {
                System.out.println("Password is invalid");
            }
        }
        catch (Exception e) {
            System.out.println("Please enter password");
        }

    }
}
