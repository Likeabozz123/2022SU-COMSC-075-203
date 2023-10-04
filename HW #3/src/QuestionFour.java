import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class QuestionFour {

    public static void numberRank (int num1, int num2, int num3) {
        int[] nums = new int[3];
        nums[0] = num1;
        nums[1] = num2;
        nums[2] = num3;
        Arrays.sort(nums);
        System.out.println(String.format("%s, %s, %s", nums[0], nums[1], nums[2]));

    }

    public static void main(String[] args) {

        numberRank(3, 10, 4);

    }

}
