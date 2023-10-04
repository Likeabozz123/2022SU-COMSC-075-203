public class QuestionThree {

    public static double function1 (double x, int y) {
        return 0;
    }

    public static double function1 (int x, double y) {
        return 1;
    }

    public static void main(String[] args) {

        double x = function1 (4, 5.0);
        double y = function1 (4, 5.4);
        double z = function1 (4.0, 5);


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

}
