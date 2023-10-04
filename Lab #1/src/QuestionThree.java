import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestionThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the degrees in celsius : ");
        double celsiusDegrees = scanner.nextDouble();

        double fahrenheitDegrees = ((celsiusDegrees * 9) /5) + 32;
        System.out.println(celsiusDegrees + " C = " + new DecimalFormat("#.#").format(fahrenheitDegrees) + " F");
    }

}
