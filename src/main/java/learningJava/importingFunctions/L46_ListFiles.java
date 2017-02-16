package learningJava.importingFunctions;

import java.io.*;
/**
 * Created by Myroslava_Zubach on 16.02.2017.
 */
class L46_ListFiles {
    public static void main(String[] args) {

        File dir = new File("data");
        if(dir.exists()) {
            String[] files = dir.list();
            System.out.println(files.length + " files were found");

            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        }

        else {
            System.out.println("Folder is empty");
        }
    }
}
