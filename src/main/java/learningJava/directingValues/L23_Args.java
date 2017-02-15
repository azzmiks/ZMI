package learningJava.directingValues;

/**
 * Created by azmiks on 13/02/2017.
 */
public class L23_Args {
    public void passingMultipleArguments() {

        String[] arg = new String[3];

        arg[0] = "16";
        arg[1] = "-";
        arg[2] = "4";

        if (arg.length != 3) {
            System.out.println("Wrong number of arguments");
            return;
        }

        int num1 = Integer.parseInt(arg[0]);
        int num2 = Integer.parseInt(arg[2]);
        String msg = arg[0] + arg[1] + arg[2] + "=";

        if (arg[1].equals("+")) msg += (num1 + num2);
        else if (arg[1].equals("-")) msg += (num1 - num2);
        else if (arg[1].equals("*")) msg += (num1 * num2);
        else if (arg[1].equals("/")) msg += (num1 / num2);
        else msg = "Wrong operation";

        System.out.println(msg);
    }
}
