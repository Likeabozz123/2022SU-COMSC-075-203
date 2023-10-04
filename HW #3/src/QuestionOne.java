import java.util.Scanner;

public class QuestionOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numInput = scanner.nextInt();

        for (int i = 0; i <= numInput; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }

    }
}
