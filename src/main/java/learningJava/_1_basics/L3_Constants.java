package learningJava._1_basics;

/**
 * Created by azmiks on 06/02/2017.
 */
public class L3_Constants {
    public void creatingConstants() {
        final int Answer1 = 1;
        final int Answer2 = 2;
        final int Answer3 = 3;

        int Q1, Q2, Q3, total;
        Q1 = 2 * Answer1;
        Q2 = 5 * Answer2;
        Q3 = 3 * Answer3;
        total = (Q1 + Q2 + Q3);

        System.out.println("Total score: " + total);
    }
}
