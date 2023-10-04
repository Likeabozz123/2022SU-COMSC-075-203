public class QuestionTwoAndThree {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }


    public static void main(String[] args) {

        int example = (int) 11.5;
        System.out.println(example);

        int example2 = (int) Math.round(11.5);
        System.out.println(example2);

        String example3 = "11";
        System.out.println(Integer.parseInt(example3));

        add(3, 4);

        // System.out.println("boo!") + 7;
    }
}
