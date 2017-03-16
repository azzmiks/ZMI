import java.io.File;

/**
 * Created by Myroslava_Zubach on 13.12.2016.
 */
public class TestApplication {
    public static void main(String []args) {
        System.out.println("Hello World");

        Math testSummary = new Math();

        int result = testSummary.summaryOfTwoNumbers(2,2);

        System.out.println(result);

        System.out.println(Integer.toString(result));


        testSummary.println(Integer.toString(result));

        File file = new File("src/main/resources/cross.png");

        System.out.println(file.exists());

    }
}
