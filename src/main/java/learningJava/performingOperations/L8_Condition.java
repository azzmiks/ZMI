package learningJava.performingOperations;

/**
 * Created by azmiks on 07/02/2017.
 */
public class L8_Condition {
    public void examiningConditions() {
        int num1 = 1357;
        int num2 = 2468;
        String result;

        result = (num1 % 2 !=0)? "Odd": "Even";
        System.out.println(num1 + " - " + result);

        result = (num2 % 2 !=0)? "Odd": "Even";
        System.out.println(num2 + " - " + result);
    }
}