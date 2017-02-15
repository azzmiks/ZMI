package learningJava.performingOperations;

/**
 * Created by azmiks on 07/02/2017.
 */
public class L11_Bitwise {
    public void workingWithBits() {
        int fs = 53; // 00110101
        System.out.println("Flag 1: " + (((fs&1) > 0)? "On": "Off"));
        System.out.println("Flag 2: " + (((fs&2) > 0)? "On": "Off"));
        System.out.println("Flag 3: " + (((fs&4) > 0)? "On": "Off"));
        System.out.println("Flag 4: " + (((fs&8) > 0)? "On": "Off"));
        System.out.println("Flag 5: " + (((fs&16) > 0)? "On": "Off"));
        System.out.println("Flag 6: " + (((fs&32) > 0)? "On": "Off"));
        System.out.println("Flag 7: " + (((fs&64) > 0)? "On": "Off"));
        System.out.println("Flag 8: " + (((fs&128) > 0)? "On": "Off"));
    }
}
