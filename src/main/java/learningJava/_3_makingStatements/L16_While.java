package learningJava._3_makingStatements;

/**
 * Created by azmiks on 11/02/2017.
 */
public class L16_While {
    public void loopingWhile() {

        int num = 100;

        while (num > 0) {
            System.out.println("Count using While: " + num);
            num -= 10;
        }
    }
}
