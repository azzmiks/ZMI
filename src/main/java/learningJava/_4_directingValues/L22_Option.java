package learningJava._4_directingValues;

/**
 * Created by azmiks on 13/02/2017.
 */
public class L22_Option {
    public void passingArgument() {

        String[] str = new String[1];
        str[0] = "-en";

        if (str[0].equals("-en")) {
            System.out.println("English");
        }
        else if (str[0].equals("-es")) {
            System.out.println("Spanish");
        }

        else
            System.out.println("Unknown");
    }
}
