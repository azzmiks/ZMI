package learningJava.importingFunctions;

import java.util.ArrayList;

/**
 * Created by Myroslava_Zubach on 16.02.2017.
 */
class L51_Lists {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Alfa");
        list.add("Delta");
        list.add("Charlie");
        System.out.println("List: " + list);

        System.out.println("Replace: " + list.get(1) + "\n");
        list.set(1, "Bravo");

        list.forEach((x) -> System.out.println("Element: " + x));
    }

}
