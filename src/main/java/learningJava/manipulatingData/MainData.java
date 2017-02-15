package learningJava.manipulatingData;

/**
 * Created by azmiks on 15/02/2017.
 */
public class MainData {
    public static void main(String[] args) {

        System.out.println("<L28_Pi>");
        L28_Pi l28_pi = new L28_Pi();
        l28_pi.usingMathPi();

        System.out.println("\n<L29_Power>");
        L29_Power l29_power = new L29_Power();
        l29_power.usingMathPowAndMathSqrt();

        System.out.println("\n<L30_Round>");
        L30_Round l30_round = new L30_Round();
        l30_round.usingMathRoundFloorCeil();

        System.out.println("\n<L31_Compare>");
        L31_Compare l31_compare = new L31_Compare();
        l31_compare.findingMaxMinValue();

        System.out.println("\n<L32_Random>");
        L32_Random l32_random = new L32_Random();
        l32_random.usingMathRandom();

        System.out.println("\n<L33_Lottery>");
        L33_Lottery l33_lottery = new L33_Lottery();
        l33_lottery.generatingRandomNumbers();

        System.out.println("\n<L34_StringLength>");
        L34_StringLength l34_stringLength = new L34_StringLength();
        l34_stringLength.concatStrings();

        System.out.println("\n<L35_StringComparison>");
        L35_StringComparison l35_stringComparison = new L35_StringComparison();
        l35_stringComparison.comparingStrings();

        System.out.println("\n<L36_StringSearch>");
        L36_StringSearch l36_stringSearch = new L36_StringSearch();
        l36_stringSearch.searchingStrings();

        System.out.println("\n<L37_CharacterSwap>");
        L37_CharacterSwap l37_characterSwap = new L37_CharacterSwap();
        l37_characterSwap.manipulatingCharacters();

    }
}
