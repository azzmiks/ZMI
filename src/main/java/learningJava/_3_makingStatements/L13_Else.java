package learningJava._3_makingStatements;

/**
 * Created by azmiks on 09/02/2017.
 */
public class L13_Else {
    public void branchingWithElseIf() {

        int hrs = 25;

        if ((hrs >= 6) && (hrs < 12)) {
            System.out.println("Good morning, it's " + hrs + " AM");
        }

        else if ((hrs >= 12) && (hrs < 18)) {
            System.out.println("Good afternoon, it's " + hrs + " PM");
        }

        else if ((hrs >= 18) && (hrs < 24)) {
            System.out.println("Good evening, it's " + hrs + " PM");
        }

        else if ((hrs >= 0) && (hrs < 6)) {
            System.out.println("Good night, it's " + hrs + " AM");
        }

        else System.out.println("You live on another planet");
    }
}
