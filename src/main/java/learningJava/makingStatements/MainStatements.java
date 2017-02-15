package learningJava.makingStatements;

/**
 * Created by azmiks on 15/02/2017.
 */
public class MainStatements {
    public static void main(String[] args) {

        System.out.println("\n<L12_If>");
        L12_If l12_if = new L12_If();
        l12_if.branchingWithIf();

        System.out.println("\n<L13_Else>");
        L13_Else l13_else = new L13_Else();
        l13_else.branchingWithElseIf();

        System.out.println("\n<L14_Switch>");
        L14_Switch l14_switch = new L14_Switch();
        l14_switch.switchingBranches();

        System.out.println("\n<L15_For>");
        L15_For l15_for = new L15_For();
        l15_for.loopingFor();

        System.out.println("\n<L16_While>");
        L16_While l16_while = new L16_While();
        l16_while.loopingWhile();

        System.out.println("\n<L17_DoWhile>");
        L17_DoWhile l17_doWhile = new L17_DoWhile();
        l17_doWhile.loopingDoWhile();

        System.out.println("\n<L18_Break>");
        L18_Break l18_break = new L18_Break();
        l18_break.usingBreakAndContinue();

        System.out.println("\n<L19_Label>");
        L19_Label l19_label = new L19_Label();
        l19_label.usingOuterLoop();
    }
}
