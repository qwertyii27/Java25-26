import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExample {
  public static void main(String[] args) {
    String filePath = "info.bin";

    // use try with resrources to open a file output stream.
    try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
      // verification token
      dataOutputStream.writeUTF("geTo");

      // loop to stream some integer values
      for (int i = 0; i < 10; i++) {
        // serialize each integer
        dataOutputStream.writeInt(i);
      }
      System.out.println("data saved to " + filePath);

    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}
