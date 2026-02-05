import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DelimiterExample {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("poem.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[^A-Za-z0-9]+");
        int count = 0;
        while (in.hasNext()) {
            String word = in.next();
            System.out.println(word);
            count++;
        }
        System.out.printf("%d words were scanned in.", count);
        in.close();
    }
}
