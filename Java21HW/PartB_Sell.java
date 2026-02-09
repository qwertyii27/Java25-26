import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB_Sell {
  public static void output(String dept, String manage, double income) {
    System.out.printf("%15s | %15s | %10.2f%n", dept, manage, income);
  }

  public static void output(String dept, String manage, String income) {
    System.out.printf("%15s | %15s | %12s%n", dept, manage, income);
  }

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("sales_by_cat.txt");
    Scanner in = new Scanner(file);

    while (in.hasNextLine()) {

      String line = in.nextLine();
      Scanner lineReader = new Scanner(line);

      lineReader.useDelimiter("[,\n ]+");

      String department = lineReader.next().trim();
      String manager = lineReader.next().trim();
      double revenue;
      if (lineReader.hasNextDouble()) {
        revenue = lineReader.nextDouble();
      } else {
        revenue = 0;
        lineReader.next();
      }
      System.out.printf("%10s | %10s | $ %10.2f%n", department, manager, revenue);
      lineReader.close();
    }
    in.close();
  }
}
