import java.util.Arrays;

public class QuestionOne {

    public static void main(String[] args) {

        int[][] fiveByFive2DArray = new int[5][5];  // auto intializes with all zeros

        int[] studentA= new int[]{98, 88, 76, 56, 100};
        int[] studentB= new int[]{87, 67, 89, 100, 87};
        int[] studentC= new int[]{87, 98, 88, 99, 96};
        int[] studentD= new int[]{87, 88, 92, 87, 67};
        int[] studentE= new int[]{100, 100, 89, 87, 78};

        fiveByFive2DArray = new int[][]{studentA, studentB, studentC, studentD, studentE};

        int highestScore = 0;
        int studentIndex = 0;
        for (int i = 0; i < fiveByFive2DArray.length; i++) {
            if (fiveByFive2DArray[i][2] > highestScore) {
                highestScore = fiveByFive2DArray[i][2];
                studentIndex = i;
            }
        }
        System.out.println("Student " + studentIndex + " : " + highestScore); // student d's index

        for (int i = 0; i < fiveByFive2DArray.length; i++) {
            double averageScore = 0;
            for (int j = 0; j < fiveByFive2DArray.length; j++) {
                averageScore += fiveByFive2DArray[i][j];
            }
            averageScore /= fiveByFive2DArray.length;
            System.out.println("Student" + i + 1 + "'s Average Exam Score is " + averageScore);
        }

    }
}
