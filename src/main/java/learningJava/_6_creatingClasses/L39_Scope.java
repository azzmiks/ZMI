package learningJava._6_creatingClasses;

/**
 * Created by azmiks on 15/02/2017.
 */
public class L39_Scope {
    final static String txt = "Global variable in Scope";

    public static void main(String[] args) {

        String txt = "Local variable in main";
        System.out.println(txt);
        sub();
        System.out.println(L39_Scope.txt);
    }

    public static void sub() {

        //String txt = "Local variable in sub";
        System.out.println(txt);
    }
}
