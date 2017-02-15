package learningJava.makingStatements;

/**
 * Created by azmiks on 12/02/2017.
 */
public class L19_Label {
    public static void main(String[] args) {

        outerLoop: for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {

                if (i == 1 && j ==1) {
                    System.out.println("outerLoop continue on i=" + i + " j=" + j);
                    continue outerLoop;
                }

                if (i == 2 && j == 3) {
                    System.out.println("outerLoop ends on i=" + i + " j=" + j);
                    break outerLoop;
                }

                System.out.println("i=" + i + " j=" + j);
            }
        }

    }
}
