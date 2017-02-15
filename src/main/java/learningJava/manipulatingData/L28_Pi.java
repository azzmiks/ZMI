package learningJava.manipulatingData;

/**
 * Created by azmiks on 14/02/2017.
 */
public class L28_Pi {
    public static void main(String[] args) {

        //float radius = Float.parseFloat(args[0]);
        float radius = 5;
        float shortPi = (float) Math.PI;

        float circ = shortPi * (radius + radius);
        float area = shortPi * (radius * radius);

        System.out.println("Range from " + Math.PI + " to " + shortPi);
        System.out.println("Radius: " + radius + "sm");
        System.out.println("Circle length: " + circ);
        System.out.println("Circle square: " + area);
    }
}
