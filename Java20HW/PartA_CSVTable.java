// Made by Georgio, no AI or outide help used, et cetera et cetera.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA_CSVTable {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("customerdata.txt");
        Scanner in = new Scanner(inFile);
        in.useDelimiter("[, \n]+");

        System.out.println("---------------------------------------");
        System.out.println("   ID  |    Name     |     Balance ");
        System.out.println("---------------------------------------");
        while (in.hasNext()) {
            System.out.printf("%06d |", in.nextInt());
            System.out.printf("%12s |", in.next());
            System.out.printf("$ %,15.2f%n", in.nextDouble());
        }
    }
}
