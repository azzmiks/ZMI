package learningJava.manipulatingData;

/**
 * Created by azmiks on 14/02/2017.
 */
public class L32_Random {
    public void usingMathRandom() {

        float random = (float) Math.random();
        System.out.println("Random number: " + random);

        float multiplied = random * 10;
        System.out.println("Random number *10: " + multiplied);

        int randomInt = (int) Math.ceil(multiplied);
        System.out.println("Random int number: " + randomInt);
    }
}
