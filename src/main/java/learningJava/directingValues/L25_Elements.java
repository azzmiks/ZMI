package learningJava.directingValues;

/**
 * Created by azmiks on 13/02/2017.
 */
public class L25_Elements {
    public static void main(String[] args) {

        int[] sklep_q1 = {20000, 15000, 21000};
        int[] sklep_q2 = {17000, 13000, 30000};
        int[] sklep_q3 = {24000, 26000, 29000};
        int[] sklep_q4 = {22000, 19000, 16000};

        int[] outlet_q1 = {23000, 14000, 26000};
        int[] outlet_q2 = {18000, 16000, 29000};
        int[] outlet_q3 = {26000, 27000, 28000};
        int[] outlet_q4 = {21000, 18000, 17000};

        int[] sum = new int[12];
        int total = 0;

        for (int i = 0; i<sklep_q1.length; i++) {
            sum[i] = sklep_q1[i] + outlet_q1[i];
            sum[i+3] = sklep_q2[i] + outlet_q2[i];
            sum[i+6] = sklep_q3[i] + outlet_q3[i];
            sum[i+9] = sklep_q4[i] + outlet_q4[i];
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println("Month" + (i+1) + " sales:\t" + sum[i]);
            total += sum[i];
        }

        System.out.println("Annual sales:\t" + total);
    }
}
