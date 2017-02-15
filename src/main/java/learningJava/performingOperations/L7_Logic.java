package learningJava.performingOperations;

/**
 * Created by azmiks on 07/02/2017.
 */
public class L7_Logic {

    public void l7() {

        boolean yes = true;
        boolean no = false;

        System.out.println("Yes & Yes: " + (yes && yes));
        System.out.println("Yes & No: " + (yes && no));

        System.out.println("Yes or Yes: "+ (yes || yes));
        System.out.println("Yes or no: " + (yes || no));
        System.out.println("No or no: " + (no || no));

        System.out.println("Yes: " + yes);
        System.out.println("Not yes: " + !yes);
    }

//    @Override
//    public boolean equals(Object obj) {
//    return true;
//    }
}
