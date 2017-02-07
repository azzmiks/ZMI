/**
 * Created by azmiks on 07/02/2017.
 */
public class L4_Arithmetic {
    public static void main (String[] args)
    {
        int num = 100;
        int factor = 20;
        int sum = 0;

        sum = num + factor; // 100+20
        System.out.println("Sum result: " + sum);

        sum = num - factor; // 100-20
        System.out.println("Subtruction result: " + sum);

        sum = num * factor; // 100*20
        System.out.println("Multiplication result: " + sum);

        sum = num / factor; // 100/20
        System.out.print("Division result: " + sum);

        sum = num % factor; // 100 % 20
        System.out.println("Division by modulo: " + sum); // why the result is not displayed from the new line?
    }
}
