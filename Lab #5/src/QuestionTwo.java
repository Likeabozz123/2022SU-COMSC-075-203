public class QuestionTwo {

    public static void main(String[] args) {
        double num1 = Integer.parseInt(args[0]);
        double num2 = Integer.parseInt(args[2]);
        if (args.length == 0) {
            System.out.println("Usage: number plus|minus|times|div number");
            return;
        }
        if (args.length > 3) {
            System.out.println("More then 3 arguments");
            return;
        }

        if (args[1].equalsIgnoreCase("plus")) {
            System.out.println(num1 + num2);
        }
        if (args[1].equalsIgnoreCase("minus")) {
            System.out.println(num1 - num2);
        }
        if (args[1].equalsIgnoreCase("times")) {
            System.out.println(num1 * num2);
        }
        if (args[1].equalsIgnoreCase("div")) {
            System.out.println(num1 / num2);
        }

    }

}
