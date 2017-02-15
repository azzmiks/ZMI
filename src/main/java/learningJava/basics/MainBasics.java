package learningJava.basics;

/**
 * Created by Myroslava_Zubach on 15.02.2017.
 */
public class MainBasics {

    public static void main (String[] args) {

        System.out.println("<L1_FirstVariables>");
        L1_FirstVariables l1_firstVariables = new L1_FirstVariables();
        l1_firstVariables.showMessages();

        System.out.println("\n<L2_DataTypes>");
        L2_DataTypes l2_dataTypes = new L2_DataTypes();
        l2_dataTypes.recognizingDataTypes();

        System.out.println("\n<L3_Constants>");
        L3_Constants l3_constants = new L3_Constants();
        l3_constants.creatingConstants();
    }
}
