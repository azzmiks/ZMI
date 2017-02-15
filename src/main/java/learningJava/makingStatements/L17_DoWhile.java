package learningJava.makingStatements;

/**
 * Created by azmiks on 11/02/2017.
 */
public class L17_DoWhile {
    public static void main(String[] args) {

        int num = 100;

        do {
            System.out.println("Count using DoWhile: " + num);
            num += 10;
        }
        while (num < 0);
    }
}
