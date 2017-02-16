package learningJava.importingFunctions;

import java.util.Arrays;

/**
 * Created by Myroslava_Zubach on 16.02.2017.
 */
class L50_Sort {
    public static void main(String[] args) {

        String[] names = {"Mike", "Dave", "John"};
        int[] nums = {300, 100, 200};

        display(names);
        display(nums);

        Arrays.sort(names);
        Arrays.sort(nums);

        display(names);
        display(nums);
    }

    public static void display (String[] elems) {

        System.out.println("\nString Array: ");
        for (int i = 0; i < elems.length; i++){
            System.out.println("Element " + i + " - " + elems[i]);
        }
    }

    public static void display (int[] elems) {

        System.out.println("Int Array: ");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Element " + i + " - " + elems[i]);
        }
    }
}
