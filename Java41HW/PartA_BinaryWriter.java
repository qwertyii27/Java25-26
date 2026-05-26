import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PartA_BinaryWriter {

  public static void main(String[] args) {
    String filePath = "data.bin";
    Scanner in = new Scanner(System.in);

    System.out.println("Give ID (int):");
    int id = in.nextInt();
    System.out.println("Give Salary (double):");
    double salary = in.nextDouble();
    in.nextLine();
    System.out.println("Give firstName (String):");
    String firstName = in.next();
    System.out.println("Give lastName (String):");
    String lastName = in.next();

    Employee employee = new Employee(firstName, lastName, id, salary);

    // use try with resrources to open a file output stream.
    try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
      // write data.
      objectOutputStream.writeObject(employee);
      employee.displayInfo();
      System.out.println("data saved to " + filePath);

    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
    in.close();
  }
}
