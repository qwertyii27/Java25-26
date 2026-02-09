import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Catch {
  public static void main(String[] args) {
    File file = new File("missing.txt");
    Scanner in;
    try {
      in = new Scanner(file);

    } catch (FileNotFoundException e) {
      System.err.println("");
      System.err.println("Error: " + e.getMessage());
      return;
    }

    while (in.hasNextLine()) {
      String currentLine = in.nextLine();
      System.out.println(currentLine);
    }

    in.close();
  }
}
