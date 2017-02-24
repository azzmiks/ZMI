package learningJava._4_directingValues;

/**
 * Created by azmiks on 13/02/2017.
 */
public class L21_Array {
    public void creatingVariableArrays() {

        String[] str = {"Java ", "is ", "good" };

//        List<Object> test = new ArrayList<>();
//
//        ArrayList<String> test33 = new ArrayList<>();
//
//
//        test.add("test-string");
//        test.add(1);
//        test.add(new String("test-string2"));
//
//        System.out.println(test.contains(1L));

//        "test".length();
//
//        String testVariable = "testuyfviweh weigbdgui gduighsdughksd ghuisdgisdu ghksdugsduighsduif ghsidufghuidghsdui ghksdghksdug ";
//        String testVariable2 = new String( "testuyfviweh weigbdgui gduighsdughksd ghuisdgisdu ghksdugsduighsduif ghsidufghuidghsdui ghksdghksdug");
//
//        int intValue = 1;
//
//        Integer intValue2 = new Integer(1);
//        Integer intValue3 = 3;
//
//        int abc = intValue3;
//
//        Character a = 'a';
//
//        char abcsdd = a;


        int[] num = new int[3];

        num[0] = 100;
        num[1] = 200;

        str[2] = "awesome";

        System.out.println("String array length: " + str.length);
        System.out.println("Number array length: " + num.length);
        System.out.println(num[0] + ", " + num[1] + ", " + num[2]);
        System.out.println(str[0] + str[1] + str[2]);
    }
}
