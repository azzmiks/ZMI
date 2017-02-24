package learningJava._4_directingValues;

/**
 * Created by azmiks on 13/02/2017.
 */
public class L27_Exceptions {
    public void catchingExceptions() {

        String[] arg = new String[1];
        arg[0] = "23";

        try {

            int num = Integer.parseInt(arg[0]);
            System.out.println("Entered number is: " + num);
        }

        catch (IndexOutOfBoundsException e) {
            System.out.println("Please enter int number");
        }

        catch (NumberFormatException e) {
            System.out.println("Wrong argument format");
        }

        finally {
            System.out.println("The End");
        }
    }
}
