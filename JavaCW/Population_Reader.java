
// NOT made by Georgio. Sourced from example.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Population_Reader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Top5Population.txt");
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            int i = 0;
            while (Character.isDigit(line.charAt(i)) == false) {
                i++;
            }
            String name = line.substring(0, i);
            name = name.trim();
            int pop = Integer.valueOf(line.substring(i).trim());
            System.out.printf("%16s: %,16d%n", name, pop);
        }
        in.close();
    }
}
