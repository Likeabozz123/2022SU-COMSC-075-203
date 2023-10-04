public class QuestionFive {

    public static int teenSum(int num1, int num2) {
        if (num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19) {
            return 19;
        } else {
            return num1 + num2;
        }

    }

    public static void main(String[] args) {

        System.out.println(teenSum(3,4));
        System.out.println(teenSum(10,13));
        System.out.println(teenSum(13,2));

    }

}
