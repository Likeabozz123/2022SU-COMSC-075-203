import java.text.DecimalFormat;
import java.util.Scanner;

public class QuestionOne {

/*
Name : Daryan Trinh
Date : 7/3/2022

This program will take an input of the distance between the object and the lens in meters,
and also take an input of the distance from the lens to image sensor in centimeters. It will
output the focal length calculation of the two givens.

*/

    public static void print(String string) {
        System.out.print(string);
    }

    public static double reciprocalOf(double num) {
        return 1 / num;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        print("Enter distance from object to lens in meters: ");
        double distanceFromObjToLens = scanner.nextDouble() * 1000;

        print("Enter distance from lens to image sensor in cm: ");
        double distanceFromLensToSensor = scanner.nextDouble() * 10;

        String focalLength = new DecimalFormat("#.##").format(reciprocalOf( reciprocalOf(distanceFromObjToLens) + reciprocalOf(distanceFromLensToSensor)));
        print(String.format("The focal length is %s", focalLength));




    }
}
