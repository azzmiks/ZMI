package learningJava;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by azmiks on 11/02/2017.
 */
public class L15_For {
    public static void main(String[] args) {

        int num = 0;

        for (int i = 1; i < 4; i++) {
            System.out.println("External cycle i=" + i);

            for (int j = 1; j < 4; j++){
                System.out.print("\tInternal cycle j=" + j);
                System.out.println("\t\tTotal num=" + (++num));
            }
        }

        List<String> list = new ArrayList<>();

        list.add("Test");
        list.add("Test2");

//        while (list.iterator().hasNext()){
//            System.out.print(list.iterator().next());
//        }
    }
}
