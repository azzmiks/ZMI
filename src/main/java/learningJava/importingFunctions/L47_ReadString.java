package learningJava.importingFunctions;

import java.io.*;

/**
 * Created by Myroslava_Zubach on 16.02.2017.
 */
class L47_ReadString {
    public void readingConsolInput() {

        System.out.println("Please enter book name");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String input = "";

        try {
            input = buffer.readLine();
            buffer.close();
        }
        catch (IOException e) {
            System.out.println("Input error");
        }

        System.out.println("\nYou are reading \"" + input + "\"");
    }
}
