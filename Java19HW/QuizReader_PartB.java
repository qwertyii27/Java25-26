import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizReader_PartB {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        double quizAvg = 0;
        File inputFile = new File("quizzes.txt");
        PrintWriter out = new PrintWriter("formatted.txt");
        Scanner in = new Scanner(inputFile);
        ArrayList<Double> quizzes = new ArrayList<Double>();

        while (in.hasNextDouble()) {
            quizzes.add(in.nextDouble());
        }
        for (double quiz : quizzes) {
            out.printf("Quiz %03d: %3.2f%n", count, quiz);
            quizAvg += quiz;
            count++;
        }
        quizAvg = quizAvg / count;
        out.println("-------------------");
        out.printf("Average:  %3.2f%n", quizAvg);
        in.close();
        out.close();
    }
}
