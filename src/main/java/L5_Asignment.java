/**
 * Created by azmiks on 07/02/2017.
 */
public class L5_Asignment {
    public static void main (String[] args)
    {
        String txt = "Fantastic ";
        String lang = "Java";
        txt += lang;
        System.out.println("Strings: " + txt);

        int sum = 10;
        int num = 20;
        sum -= num;
        System.out.println("Numbers: " + sum);

        int factor = 5;
        sum *= factor;
        System.out.println("Multiplication: " + sum);

        sum /= factor;
        System.out.println("Division: " + sum);
    }
}
