package learningJava.directingValues;

/**
 * Created by azmiks on 12/02/2017.
 */
public class L20_Convert {
    public void convertingValues() {

        float daysFloat = 365.25f;
        String weeksString = "52";

        int daysInt = (int) daysFloat;
        int weeksInt = Integer.parseInt(weeksString);

        int week = daysInt/weeksInt;
        System.out.println("The amount of days in a week: " + week);
    }
}
