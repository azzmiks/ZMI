package learningJava;

/**
 * Created by azmiks on 09/02/2017.
 */
public class L12_If {
    public static void main(String[] args) {

        if (5 > 1) System.out.println("5 is greater than 1");

        if (2 < 4) {
            System.out.println("2 is less than 4");
            System.out.println("The verification is successfully completed");
        }

        int num = 8;

        if (((num > 5) && (num < 10)) || (num == 12)) {

            System.out.println("The number is between 6 and 9 or equals 12");
        }
    }
}
