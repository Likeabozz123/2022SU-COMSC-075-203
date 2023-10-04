import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class TestAverages {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) throws IOException {

        Scanner inputScanner = new Scanner(System.in);
        print("Enter input file name with test scores: ");
        String inputFileName = inputScanner.nextLine();
        try {
            File inputFile = new File(inputFileName);
            Scanner input = new Scanner(inputFile);
            if (inputFile.length() == 0) {
                print("File is empty, fill it with some scores.");
                System.exit(0);
            }

            print("Enter output file name for averages: ");
            String outputFileName = inputScanner.nextLine();
            try {
                File outputFile = new File(outputFileName);
                Scanner output = new Scanner(outputFile);
                if (!outputFile.canWrite() || !outputFile.canRead()) {
                    print("Cannot read or write " + outputFileName);
                    System.exit(0);
                }
                FileWriter writer = new FileWriter(outputFileName);
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    line = line.replaceAll(":", ",");
                    String[] person = line.split(",");
                    String name = person[0];
                    double averageScore = 0;
                    int size = 0;
                    if (person.length == 1) {
                        print("Skipping " + person[0] + " due to having zero scores");
                    } else {
                        for (int i = 1; i < person.length; i++) {
                            person[i] = person[i].replaceAll(" ", "");
                            try {
                                averageScore += Double.parseDouble(person[i]);
                                size++;
                            } catch (NumberFormatException exception) {
                                print("Skipping bad number " + person[i] + " for " + person[0]);
                            }
                        }
                        averageScore /= size;
                        writer.write(name + ": " + new DecimalFormat("#.##").format(averageScore) + " (" +(person.length - 1) + " tests)\n");
                    }
                }
                writer.close();
            } catch (FileNotFoundException exception) {
                print("Cannot find output file" + outputFileName);
            } catch (IOException e) {
                print("IO Exception");
            }
        } catch (FileNotFoundException exception) {
            print("Cannot find input file" + inputFileName);
        }


    }
}
