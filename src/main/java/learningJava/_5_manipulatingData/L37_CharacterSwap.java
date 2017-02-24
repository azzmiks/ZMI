package learningJava._5_manipulatingData;

/**
 * Created by azmiks on 14/02/2017.
 */
public class L37_CharacterSwap {
    public void manipulatingCharacters() {

        String txt = "";

        if (txt.isEmpty()) txt = " ololo ";

        System.out.println("Srting: " + txt);
        System.out.println("Primary string length: " + txt.length());

        txt = txt.trim();

        System.out.println("String: " + txt);
        System.out.println("Secondary string length: " + txt.length());

        char initial = txt.charAt(0);
        System.out.println("First symbol: " + initial);

        initial = txt.charAt((txt.length() - 1));
        System.out.println("Last symbol: " + initial);

        txt = txt.replace('o', 'a');
        System.out.println("String: " + txt);
    }
}
