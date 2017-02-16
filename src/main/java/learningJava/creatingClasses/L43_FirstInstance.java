package learningJava.creatingClasses;

/**
 * Created by Myroslava_Zubach on 16.02.2017.
 */
class L43_FirstInstance {
    public static void main(String[] args) {

        System.out.println("Color: " + L43_Car.color);
        System.out.println("Bodytype: " + L43_Car.bodyType);
        System.out.println(L42_Car.accelerate());

        L43_Car Porsche = new L43_Car();

        System.out.println("Porsche color: " + Porsche.color);
        System.out.println("Porsche bodytype: " + Porsche.bodyType);
        System.out.println(Porsche.accelerate());
    }
}
