package learningJava.manipulatingData;

/**
 * Created by azmiks on 14/02/2017.
 */
public class L29_Power {
    public static void main(String[] args){

        //int num = Integer.parseInt(args[0]);
        int num = 9;

        int square = (int) Math.pow(num, 2);
        int cube = (int) Math.pow(num, 3);
        int sqrt = (int) Math.sqrt(num);

        System.out.println(num + " squared equals " + square);
        System.out.println(num + " cubed equals " + cube);
        System.out.println("Square root of " + num + " equals " + sqrt);
    }
}
