import java.util.Scanner;

public class QuestionOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number");
        int numInput = scanner.nextInt();
        String inputText = String.valueOf(numInput);
        int total = 0;

        for (int i = 0; i < inputText.length(); i++) {
            total += Integer.parseInt(String.valueOf(inputText.charAt(i)));
        }

        System.out.println("Total is : " + total);

    }

}
