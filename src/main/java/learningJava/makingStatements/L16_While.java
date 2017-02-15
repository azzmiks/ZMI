package learningJava.makingStatements;

/**
 * Created by azmiks on 11/02/2017.
 */
public class L16_While {
    public static void main(String[] args) {

        int num = 100;

        while (num > 0) {
            System.out.println("Count using While: " + num);
            num -= 10;
        }
    }
}
