import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExample {
  public static void main(String[] args) {
    String filePath = "info.bin";

    // use try wiht resources to open the binary file for reading (as an input data
    // stream)
    try (FileInputStream fileInputStream = new FileInputStream(filePath);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream)) {
      int i = 0;
      int val = 0;
      String token = "";
      // get token
      token += dataInputStream.readUTF();

      System.err.printf("Token: %s%n", token);
      if (token.equals("geTo"))
        while (true) {
          // keep track of the number of items that we've read in.
          i++;
          try {
            val = dataInputStream.readInt();
            System.out.printf("Value %02d: %02d%n", i, val);
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
    }
    System.out.println("Done.");
  }
}
