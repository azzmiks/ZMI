package learningJava;

/**
 * Created by azmiks on 13/02/2017.
 */
public class L22_Option {
    public static void main(String[] args) {

        if (args[0].equals("-en")) {
            System.out.println("English");
        }

        else if (args[0].equals("-es")) {
            System.out.println("Spanish");
        }

        else
            System.out.println("Unknown");
    }
}
