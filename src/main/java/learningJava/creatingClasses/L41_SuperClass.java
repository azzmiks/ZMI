package learningJava.creatingClasses;

/**
 * Created by azmiks on 15/02/2017.
 */
public class L41_SuperClass {

    public static void hello() {
        System.out.println("Hello from SuperClass");
    }

    public static void echo(String arg) {
        try {
            System.out.println("You entered: " + arg);
        }
        catch (Exception e) {
            System.out.println("Argument is needed");
        }
    }
}
