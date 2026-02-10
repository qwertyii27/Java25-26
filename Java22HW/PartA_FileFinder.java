import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//Made by Georgio.
public class PartA_FileFinder {
  public static void main(String[] args) {
    Scanner userIn = new Scanner(System.in);
    Scanner fileReader = new Scanner(System.in); // temp
    String fileName;
    boolean fileFound = false;

    while (!fileFound) {
      System.out.println("Please enter a file name or # to quit:");
      fileName = userIn.nextLine().trim();
      try {

        if (fileName.charAt(0) == '#') {
          userIn.close();
          System.out.println("Quitting per user request.");
          return;
        }
        File file = new File(fileName);
        fileFound = true;
        fileReader = new Scanner(file);
      } catch (FileNotFoundException e) {
        System.err.println("ERROR: Please enter a valid file name. Try again:");
        System.out.println(fileName);
        fileFound = false;
      }

    }
    while (fileReader.hasNextLine()) {
      String fileLine = fileReader.nextLine();
      Scanner lineReader = new Scanner(fileLine);
      while (lineReader.hasNext())
        System.out.printf("%n%s", lineReader.next().trim());
      lineReader.close();
    }
    userIn.close();
  }
}
