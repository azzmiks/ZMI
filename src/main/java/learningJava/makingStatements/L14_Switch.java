package learningJava.makingStatements;

/**
 * Created by azmiks on 09/02/2017.
 */
public class L14_Switch {
    public static void main(String[] args) {

        int month = 2, year = 2016, num = 31;

        switch (month) {

            case 4 : case 6: case 9: case 11: num = 30; break;
            case 2 : num = (year % 4 == 0) ? 29 : 28; break;
        }

        switch (month) {

            case 1:
                //some operation
            case 2:
                //
            case 3:
                //
                break;

        }


        System.out.println(month + "/" + year + ": " + num + " days");
    }
}
