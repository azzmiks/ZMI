package learningJava._4_directingValues;

/**
 * Created by azmiks on 13/02/2017.
 */
public class L26_Dimensions {
    public void addingArrayDimensions() {

        boolean[][] points = new boolean[5][20];

        points[0][5] = true;
        points[1][6] = true;
        points[2][7] = true;
        points[3][8] = true;
        points[4][9] = true;

        for (int i = 0; i < points.length; i++) {
            System.out.print("\n");

            for (int j = 0; j < points[0].length; j++) {
                char mark = (points[i][j]) ? 'X' : '-';
                System.out.print(mark);
            }
        }
    }
}
