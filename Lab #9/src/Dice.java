import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void print(String text) {
        System.out.println(text);
    }

    public static int getNRolls() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print("Please enter the amount of times you would like to roll the dice (1-999)");
            int rolls = scanner.nextInt();
            if (rolls < 1 || rolls > 999) {
                print("Invalid amount");
            } else {
                return rolls;
            }
        }
    }

    public static int[][] rollDice(int rollAmount) {
        Random random = new Random();
        int[][] rolls = new int[6][6];
        for (int i = 0; i < rollAmount; i++) {
            int firstDiceRoll = random.nextInt(6);
            int secondDiceRoll = random.nextInt(6);
            rolls[firstDiceRoll][secondDiceRoll] += 1;
        }

        return rolls;
    }

    public static void printRolls(int[][] rolls) {
        print("      1   2   3   4   5   6");
        print("    ------------------------");
        for (int i = 0; i < rolls.length; i++) {
            StringBuilder line = new StringBuilder((i + 1) + "| ");
            for (Integer num : rolls[i]) {
                if (num >= 10) {
                    line.append("  ").append(num);
                } else {
                    line.append("   ").append(num);
                }
            }
            print(line.toString());
        }

    }

    public static int[] calcFrequencies(int[][] rolls) {

        int[] totals = new int[11];
        for (int i = 0; i < rolls.length; i++) {
            for (int j = 0; j < rolls.length; j++) {
                totals[i+j] += rolls[i][j];
            }
        }

        return totals;
    }

    public static void printFrequencies(int[] totals) {
        for (int i = 0; i < totals.length; i++) {
            print(i + 2 + ": " + totals[i]);
        }
    }




    public static void main(String[] args) {
        int rollAmount = getNRolls();
        int[][] rolls = rollDice(rollAmount);
        print("Frequencies for individual dice");
        printRolls(rolls);

        int[] totals = calcFrequencies(rolls);
        print("");
        print("");
        print("");
        print("Frequencies of Totals");
        printFrequencies(totals);


    }

}
