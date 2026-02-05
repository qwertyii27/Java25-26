
// NOT made by Georgio. Sourced from example.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Obesity_Reader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Top5Obesity.txt");
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {

            // here, Eng uses an individual scanner for each line.
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);

            // The delimiter, uses comma and newline.
            lineScanner.useDelimiter("[,\n]+");

            // reads data and removes unnecessary whitespace affix or suffix.
            String name = lineScanner.next().trim();

            String nextWord = lineScanner.next().trim();
            double percentage = Double.valueOf(nextWord); // parses from text to Double (NOT double).

            nextWord = lineScanner.next().trim();
            int rank = Integer.valueOf(nextWord); // parses from text to Integer (NOT int).

            String region = lineScanner.next().trim();

            // print formatted output.
            System.out.printf("Ranked #%3d: %16s, %6.2f%%, %20s%n",
                    rank, name, percentage, region);
            lineScanner.close();
        }
        in.close();
    }
}
