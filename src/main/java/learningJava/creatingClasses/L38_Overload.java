package learningJava.creatingClasses;

/**
 * Created by azmiks on 15/02/2017.
 */
public class L38_Overload {
    public static void main(String[] args) {

        System.out.println(write(12));
        System.out.println(write("Twelve"));
        System.out.println(write(16,4));
    }

    public static String write (int num) {
        return ("Int value: " + num);
    }

    public static String write (String num) {

        return ("String value: " + num);
    }

    public static String write (int num1, int num2) {

        return ("Result: " + (num1 * num2));
    }


}
