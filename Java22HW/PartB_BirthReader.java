import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB_BirthReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("birthyears.txt");
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {
            Scanner lineReader = new Scanner(in.nextLine());
            lineReader.useDelimiter("[, \n]+");
            int year = 0;
            String name = lineReader.next().trim();
            try {
                year = Integer.parseInt(lineReader.next().trim());
            } catch (NumberFormatException e) {
                year = 0;
            }
            if (year == 0) {
                System.out.printf("%n I do not know the year %s was born in.", name);
            } else {
                System.out.printf("%n%s was born in %d.", name, year);
            }
            lineReader.close();
        }
        in.close();
    }
}
