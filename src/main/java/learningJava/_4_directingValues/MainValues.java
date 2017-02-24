package learningJava._4_directingValues;

/**
 * Created by azmiks on 15/02/2017.
 */
public class MainValues {
    public static void main(String[] args) {

        System.out.println("<L20_Convert>");
        L20_Convert l20_convert = new L20_Convert();
        l20_convert.convertingValues();

        System.out.println("\n<L21_Array>");
        L21_Array l21_array = new L21_Array();
        l21_array.creatingVariableArrays();

        System.out.println("\n<L22_Option>");
        L22_Option l22_option = new L22_Option();
        l22_option.passingArgument();

        System.out.println("\n<L23_Args>");
        L23_Args l23_args = new L23_Args();
        l23_args.passingMultipleArguments();

        System.out.println("\n<L24_Loops>");
        L24_Loops l24_loops = new L24_Loops();
        l24_loops.loopingThroughElements();

        System.out.println("\n<L25_Elements>");
        L25_Elements l25_elements = new L25_Elements();
        l25_elements.changingElementValues();

        System.out.println("\n<L26_Dimensions>");
        L26_Dimensions l26_dimensions = new L26_Dimensions();
        l26_dimensions.addingArrayDimensions();

        System.out.println("\n<L27_Exceptions>");
        L27_Exceptions l27_exceptions = new L27_Exceptions();
        l27_exceptions.catchingExceptions();
    }
}
