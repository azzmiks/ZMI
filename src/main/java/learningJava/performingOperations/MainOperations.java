package learningJava.performingOperations;

/**
 * Created by azmiks on 15/02/2017.
 */
public class MainOperations {
    public static void main(String[] args){

        System.out.println("<L4_Arithmetic>");
        L4_Arithmetic l4_arithmetic = new L4_Arithmetic();
        l4_arithmetic.doingArithmetic();

        System.out.println("\n<L5_Assignment>");
        L5_Assignment l5_assignment = new L5_Assignment();
        l5_assignment.assigningValues();

        System.out.println("\n<L6_Comparison>");
        L6_Comparison l6_comparison = new L6_Comparison();
        l6_comparison.comparingValues();

        System.out.println("\n<L7_Logic>");
        L7_Logic l7_logic = new L7_Logic();
        l7_logic.assessingLogic();

        System.out.println("\n<L8_Condition>");
        L8_Condition l8_condition = new L8_Condition();
        l8_condition.examiningConditions();

        System.out.println("\n<L9_Precedence>");
        L9_Precedence l9_precedence = new L9_Precedence();
        l9_precedence.settingPrecedence();

        System.out.println("\n<L10_Escape>");
        L10_Escape l10_escape = new L10_Escape();
        l10_escape.escapingLiterals();

        System.out.println("\n<L11_Bitwise>");
        L11_Bitwise l11_bitwise = new L11_Bitwise();
        l11_bitwise.workingWithBits();
    }
}
