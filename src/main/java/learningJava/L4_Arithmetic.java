package learningJava;

/**
 * Created by azmiks on 07/02/2017.
 */
public class L4_Arithmetic {
    public static void main (String[] args)
    {
        int num = 100;
        int factor = 20;
        int sum = 0;

        float lowerPrecission = -1.1F;
        long test = 1L;
        double higherPrecission = 1.00000000005D;

        int a = 2;

        System.out.println((int) lowerPrecission + a);

        System.out.println(higherPrecission + test);

        System.out.println(lowerPrecission + higherPrecission);

        sum = num + factor; // 100+20
        System.out.println("Sum result: " + sum);

        sum = num - factor; // 100-20
        System.out.println("Subtruction result: " + sum);

        sum = num * factor; // 100*20
        System.out.println("Multiplication result: " + sum);

        sum = num / factor; // 100/20
        System.out.println("Division result: " + sum);

        sum = num % factor; // 100 % 20
        System.out.println("Division by modulo: " + sum);
    }
}
