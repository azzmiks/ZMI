package learningJava._6_creatingClasses.extendingClass;

/**
 * Created by azmiks on 15/02/2017.
 */
public class L41_SubClass extends L41_SuperClass {

    public static void main (String[] args) {


        hello();
        L41_SuperClass.hello();
        echo(args[0]);

    }

    public static void hello() {
        System.out.println("Hello from SubClass");
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
