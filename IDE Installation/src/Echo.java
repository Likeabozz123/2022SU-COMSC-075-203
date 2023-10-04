import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type something : ");
        input = scanner.nextLine();
        System.out.println("You said : " + input);

        System.out.println("Type something else : ");
        input = scanner.nextLine();
        System.out.println("You also said : " + input);

        int numInput = scanner.nextInt();
        System.out.println(numInput);

    }

}
