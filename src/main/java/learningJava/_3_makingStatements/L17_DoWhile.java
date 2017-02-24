package learningJava._3_makingStatements;

/**
 * Created by azmiks on 11/02/2017.
 */
public class L17_DoWhile {
    public void loopingDoWhile() {

        int num = 100;

        do {
            System.out.println("Count using DoWhile: " + num);
            num += 10;
        }
        while (num < 0);
    }
}
