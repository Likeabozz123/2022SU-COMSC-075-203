import java.util.Arrays;

public class QuestionTwo {

    public static void lookForNum(int num, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                System.out.println("Found, index : " + i);
            }
        }
    }

    public static void main(String[] args) {
        lookForNum(3, new int[]{4, 7, 3});
    }

}
