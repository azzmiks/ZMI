package learningJava._7_importingFunctions;

import java.io.*;
/**
 * Created by Myroslava_Zubach on 16.02.2017.
 */
public class L48_ReadFile {
    public void readingFiles() {

        try {
        FileReader file = new FileReader("C:\\Users\\Myroslava_Zubach\\IdeaProjects\\ZMI\\src\\main\\resources\\verse.txt");
        BufferedReader buffer = new BufferedReader(file);
        String line = "";
        while ((line = buffer.readLine()) != null) {
            System.out.println(line);
        }
        buffer.close();
        }

        catch (IOException e) {
            System.out.println("Reading error");
        }
    }
}
