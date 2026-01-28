import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadExample {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("example.txt");
        File outputFile = new File("out.txt");
        PrintWriter out = new PrintWriter(outputFile);
        Scanner in = new Scanner(inputFile);
        while (in.hasNext())
            out.println(in.next() + " new");
        in.close();
        out.close();
    }
}
