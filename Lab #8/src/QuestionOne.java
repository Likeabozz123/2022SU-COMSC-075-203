import java.util.ArrayList;
import java.util.List;

public class QuestionOne {

    public static int sumIntList(ArrayList<Integer> nums) {
        int total = 0;
        for(Integer num : nums) {
            total += num;
        }
        return total;
    }

    public static double sumDoubleList(ArrayList<Double> nums) {
        double total = 0;
        for(Double num : nums) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {

        ArrayList<Integer> integersList = new ArrayList<>();
        integersList.add(10);
        integersList.add(29379);
        System.out.println(sumIntList(integersList));

        ArrayList<Double> doublesList = new ArrayList<>();
        doublesList.add(1D);
        doublesList.add(30.30);
        System.out.println(sumDoubleList(doublesList));
    }
}
