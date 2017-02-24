package learningJava._4_directingValues;

/**
 * Created by azmiks on 13/02/2017.
 */
public class L24_Loops {
    public void loopingThroughElements() {
/*
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] is | " + args[i]);
            }
        }
*/

        String[] java = {"Java", "in", "easy", "steps"};

            for (int i = 0; i < java.length; i++) {
                System.out.println("java[" + i + "] is | " + java[i]);
            }

//        List<String> list = new ArrayList<>();
//
//            list.add("a");
//            list.add("b");
//            list.add("c");
//
//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println("While loop : "+iterator.next());
//        }
//
//        for (String listElement : list) {
//            System.out.println("For each: "+listElement);
//        }


        String[] htm = {"HTML5", "in", "easy", "steps"};
        int j = 0;
        while (j < htm.length) {
            System.out.println("\t\t\t\t\thtm[" + j + "] is |" + htm[j]);
            j++;
        }

        String[] xml = {"XML", "in", "easy", "steps"};
        int k = 0;
        if (xml.length > 0) {
            do {
                System.out.println("xml[" + k + "] is | " + xml[k]);
                k++;
            } while (k < xml.length);
        }
    }
}
