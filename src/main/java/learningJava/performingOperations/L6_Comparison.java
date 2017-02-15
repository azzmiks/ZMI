package learningJava.performingOperations;

/**
 * Created by azmiks on 07/02/2017.
 */
public class L6_Comparison {
    public void comparingValues() {
        String txt = "Fantastic";
        String lang = "Java";
        boolean state = (txt == lang);

        boolean test = (txt == lang);

        txt.equals(lang);


        Object object = new Object();
        Object object2 = new Object();

        L7_Logic l7_logic_Object = new L7_Logic();

        System.out.println(l7_logic_Object.equals(object));


        object.equals(object2);

        if(txt == lang) {

        }

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
