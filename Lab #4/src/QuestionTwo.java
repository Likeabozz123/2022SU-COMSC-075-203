public class QuestionTwo {

    public static boolean areFactors(int num, int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (num % nums[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(areFactors(27, new int[]{3, 9}));

    }

}
