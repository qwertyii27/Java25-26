
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class PartB_BinaryReader {
  public static void main(String[] args) {
    String filePath = "data.bin";
    ArrayList<Employee> employees = new ArrayList<Employee>();

    // use try wiht resources to open the binary file for reading (as an input data
    // stream)
    try (FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream dataInputStream = new ObjectInputStream(fileInputStream)) {

      while (true) {
        try {
          Employee employee = (Employee) dataInputStream.readObject();
          employees.add(employee);
        } catch (EOFException e) {
          System.out.println("\n End of file reached.");
          break;
        }
      }
    } catch (FileNotFoundException e) {
      System.err.println(e.getMessage());
    } catch (IOException e) {
      System.err.println("Error reading data.");
      System.err.println(e.getMessage());
    } catch (ClassNotFoundException e) {
      System.err.println("Um no class?");
      System.err.println(e.getMessage());
    }
    for (int i = 0; i < employees.size(); i++) {
      employees.get(i).displayInfo();
      System.out.println();
    }
    System.out.println("Done.");
  }
}
