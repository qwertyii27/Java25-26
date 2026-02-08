import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA_Unemployment {
  public static void main(String[] args) throws FileNotFoundException {
      File file = new File("Top5Unemployment.txt");
      Scanner in = new Scanner(file);

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%55s%n", "Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------------------------------------");
      while (in.hasNextLine()){

        String line = in.nextLine();
        Scanner lineReader = new Scanner(line);

        lineReader.useDelimiter("[,\n]+");

        String nation = lineReader.next().trim();
        double percent = Double.valueOf(lineReader.next().trim());
        int place = Integer.parseInt(lineReader.next().trim());
        String region = lineReader.next().trim();
        System.out.printf("Ranked #%3d: %30s | %3.2f%% | %30s%n", place, nation, percent, region);
      }
        System.out.println("---------------------------------------------------------------------------------------------");
  }
}
