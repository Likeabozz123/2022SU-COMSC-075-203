import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionOne {

    public static int indexOfMax(List<Integer> integers) {
        int previousInt = 0;
        for (int integer : integers) {
            if (integer > previousInt) {
                previousInt = integer;
            }
        }
        return integers.indexOf(previousInt);
    }

    public static int indexOfMax(int[] integers) {
        int previousInt = 0;
        int index = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > previousInt) {
                previousInt = integers[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(100);
        integers.add(40);
        integers.add(20);
        System.out.println(indexOfMax(integers));

        System.out.println(indexOfMax(new int[]{3, 40, 100, 20}));
    }
}
