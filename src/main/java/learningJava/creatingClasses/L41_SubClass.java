package learningJava.creatingClasses;<<<<<<< HEAD:src/main/java/learningJava/creatingClasses/extendingClass/L41_SubClass.java
package learningJava.creatingClasses.extendingClass;
=======
package learningJava.creatingClasses;
>>>>>>> a8550b04b140d140c40e052d413333fcea79e128:src/main/java/learningJava/creatingClasses/L41_SubClass.java

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

//    public static void echo(String arg) {
//        try {
//            System.out.println("You entered: " + arg);
//        }
//        catch (Exception e) {
//            System.out.println("Argument is needed");
//        }
//    }
}
