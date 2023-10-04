import java.util.Scanner;

/*
Name : Daryan Trinh
Date : 7/3/2022

This program will calculate the total volume of a 3d stair shape,
given how many steps there are, the width, length, and height of each step.

*/

public class Staircase {

    public static void printLine(String string) {
        System.out.println(string);
    }

    public static void print(String string) {
        System.out.print(string);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printLine("Staircase Volume Calculator");
        print("How many steps in the staircase? ");
        int stepsCount = scanner.nextInt();

        print("Enter step width in cm: ");
        double stepWidth = scanner.nextDouble();

        print("Enter rise of the step in cm: ");
        double stepRise = scanner.nextDouble();

        print("Enter run of the step in cm: ");
        double stepRun = scanner.nextDouble();

        int totalBlocks = (stepsCount * (stepsCount + 1)) / 2;
        double totalVolume = totalBlocks * stepWidth * stepRise * stepRun;
        int roundedVolume = (int) (totalVolume + 0.5);

       printLine(String.format("Total volume is %s cubic centimeters.", roundedVolume));


    }
}
