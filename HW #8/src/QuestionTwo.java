import java.util.ArrayList;

public class QuestionTwo {

    public static void main(String[] args) {

        ArrayList<String> capitalCity = new ArrayList<>();
        capitalCity.add("Sacramento");
        capitalCity.add("Salem");
        capitalCity.add("Olympia");
        capitalCity.add("Albany");
        capitalCity.add("Beijing");

        System.out.println(capitalCity.size());
        for (String capital : capitalCity) {
            System.out.println(capital);
        }

    }
}
