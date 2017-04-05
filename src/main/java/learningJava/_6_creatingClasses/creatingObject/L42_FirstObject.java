package learningJava._6_creatingClasses.creatingObject;

/**
 * Created by azmiks on 15/02/2017.
 */
public class L42_FirstObject {
    public static void main(String[] args) {

        System.out.println("Color: " + L42_Car.color);
        System.out.println("BodyType: " + L42_Car.bodyType);
        L42_Car car = new L42_Car();
        System.out.println(car.accelerate());


    }
}
