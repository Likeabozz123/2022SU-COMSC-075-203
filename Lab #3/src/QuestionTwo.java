import java.util.Scanner;

/*
Name : Daryan Trinh
Date : 7/3/2022

This program takes a name as an input, and takes the scores of multiple assignments/tests and adds them all up and
outputs a letter grade for the student.

Homework = 0 to 50
Midterm = 0 to 200
Lab = 0 to 100
Final = 0 to 150

Grading

> 90% = A
> 80% = B
> 70% = C
> 60% = D
< 60% = F


I am using if statements here, because I think it's easier in this situation then a switch statement, because otherwise
you would have to check the case for every single percent. (ex: case 99: gradeLetter = 'A'; case 98: gradeLetter = 'A';)

*/

public class QuestionTwo {

    public static void print(Object input) {
        System.out.print(String.valueOf(input));
    }

    public static void printLine(Object input) {
        System.out.println(String.valueOf(input));
    }

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);

            print("Name of Student: (Enter 0 to quit) : ");
            String name = scanner.nextLine();
            if (name.equals("0")) break;

            print("Total scores for Homework (out of 50): ");
            int homeworkScore = scanner.nextInt();

            print("Total scores for Midterm (out of 200): ");
            int midtermScore = scanner.nextInt();

            print("Total scores for Lab (out of 100): ");
            int labScore = scanner.nextInt();

            print("Total scores for Final (out of 150): ");
            int finalScore = scanner.nextInt();

            int totalScores = homeworkScore + midtermScore + labScore + finalScore;
            printLine(String.format("Total scores for the class (out of 500): %s", totalScores));

            float totalGrade = totalScores / 5; // totalScore * 5 === (totalScore / 500)  * 100

            char gradeLetter = 'F';

            if (totalGrade >= 90) {
                gradeLetter = 'A';
            } else if (totalGrade >= 80) {
                gradeLetter = 'B';
            } else if (totalGrade >= 70) {
                gradeLetter = 'C';
            } else if (totalGrade >= 60) {
                gradeLetter = 'D';
            }

            printLine(String.format("%s got a(n) %s for this class", name, gradeLetter));

        }

    }

}
