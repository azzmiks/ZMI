package learningJava.manipulatingData;

/**
 * Created by azmiks on 14/02/2017.
 */
public class L34_StringLength {
    public static void main(String[] args) {

        String lang = "Java";
        String series = " in easy steps";

        String title = lang.concat(series);

        System.out.println("\"" + title + "\" contains " + title.length() + " symbols");
    }
}
