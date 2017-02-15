package learningJava.manipulatingData;

/**
 * Created by azmiks on 14/02/2017.
 */
public class L33_Lottery {
    public void generatingRandomNumbers() {

        int[] nums = new int[50];
        for (int i=1; i < 50; i++) {
            nums[i] = i;
        }

        for (int i=1; i < 50; i++) {
            int r = (int) Math.ceil(Math.random() * 49);
            int temp = nums[1];
            nums[i] = nums[r];
            nums[r] = temp;
        }
        for (int i=1; i < 7; i++) {
            System.out.print(Integer.toString(nums[i])+ " ");
        }
    }
}
