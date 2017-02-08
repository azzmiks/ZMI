package learningJava;

/**
 * Created by azmiks on 07/02/2017.
 */
public class L6_Comparison {
    public static void main (String[] args)
    {
        String txt = "Fantastic";
        String lang = "Java";
        boolean state = (txt == lang); //why do we use brackets?
        System.out.println("Strings are equal: " + state);

        state = (txt != lang);
        System.out.println("Strings are not equal: " + state);

        int dozen = 12;
        int score = 20;
        state = (dozen > score);
        System.out.println("Dozen > score: " + state);

        state = (dozen < score);
        System.out.println("Dozen < score: " + state);
    }
}
