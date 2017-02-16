package learningJava.creatingClasses;

/**
 * Created by Myroslava_Zubach on 16.02.2017.
 */
class L45_Car {

    private String maker;
    private String color;
    private String bodyType;

    public L45_Car() {
        maker = "Porsche";
        color = "Silver";
        bodyType = "Coupe";
    }

    private String accelerate() {
        String motion = "Acceleration";
        return motion;
    }

    public void setCar (String brand, String paint, String style) {
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + " color " + color);
        System.out.println(maker + " bodytype " + bodyType);
        System.out.println(maker + accelerate() + "\n");
    }
}

class Constructor {
    public static void main(String[] args) {

        L45_Car Porsche = new L45_Car();
        Porsche.getCar();

        L45_Car Ferrari = new L45_Car();
        Ferrari.setCar("Ferrari", "Red", "SportCar");
        Ferrari.getCar();
    }
}