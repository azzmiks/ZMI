package learningJava._6_creatingClasses;

/**
 * Created by Myroslava_Zubach on 16.02.2017.
 */
class L44_Car {

    private String maker;
    private String color;
    private String bodyType;

    private String accelerate() {
        String motion = "Accelerating";
        return motion;
    }

    public void setCar (String brand, String paint, String style) {

        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar () {
        System.out.println(maker + " color " + color);
        System.out.println(maker + " bodytype " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }
}

class SafeInstance {
    public static void main(String[] args) {

        L44_Car Porsche = new L44_Car();
        Porsche.setCar("Porsche", "Red", "Coupe");
        Porsche.getCar();

        L44_Car Bentley = new L44_Car();
        Bentley.setCar("Bentley", "Green", "Sedan");
        Bentley.getCar();
    }

}
