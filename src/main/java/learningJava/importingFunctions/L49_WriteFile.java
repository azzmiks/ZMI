package learningJava.importingFunctions;

import java.io.*;
/**
 * Created by Myroslava_Zubach on 16.02.2017.
 */
class L49_WriteFile {
    public static void main(String[] args) {

        try {
        FileWriter file = new FileWriter("C:\\Users\\Myroslava_Zubach\\IdeaProjects\\ZMI\\src\\main\\resources\\tam.txt");
        BufferedWriter buffer = new BufferedWriter(file);

        buffer.write("I asked the Spring what happiness is");
        buffer.newLine();
        buffer.write("And it replied: \"It's beauty");
        buffer.newLine();
        buffer.write("When you are young, enjoying it");
        buffer.newLine();
        buffer.write("And thinking not of future\"");
        buffer.close();

        }
        catch (IOException e) {
            System.out.println("Writing error");
        }
    }
}
