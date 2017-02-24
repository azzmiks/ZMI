package learningJava._7_importingFunctions;

/**
 * Created by azmiks on 16/02/2017.
 */
public class MainFunctions {
    public static void main(String[] args) {

        System.out.println("<L46_ListFiles>");
        L46_ListFiles l46_listFiles = new L46_ListFiles();
        l46_listFiles.handlingFiles();

        System.out.println("\n<47_ReadString>");
        L47_ReadString l47_readString = new L47_ReadString();
        l47_readString.readingConsolInput();

        System.out.println("\n<L48_ReadFile>");
        L48_ReadFile l48_readFile = new L48_ReadFile();
        l48_readFile.readingFiles();

        System.out.println("\n<L49_WriteFile>");
        L49_WriteFile l49_writeFile = new L49_WriteFile();
        l49_writeFile.writingFiles();

        System.out.println("\n<L51_Lists>");
        L51_Lists l51_lists = new L51_Lists();
        l51_lists.managingArrays();

        System.out.println("\n<L52_DateTime>");
        L52_DateTime l52_dateTime = new L52_DateTime();
        l52_dateTime.managingDates();

        System.out.println("\n<L53_Formats>");
        L53_Formats l53_formats = new L53_Formats();
        l53_formats.changingFormat();
    }
}
