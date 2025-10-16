
// Made by Georgio...
import java.util.Scanner;

public class Alphabet_PartCConditional {
    public static void main(String[] args) {
        // get vars
        Scanner in = new Scanner(System.in);
        String num1;
        String num2;
        String num3;

        System.out.print("Please input three strings: ");
        num1 = in.next();
        num2 = in.next();
        num3 = in.next();
        if (num1.compareTo(num2) <= 0 && num2.compareTo(num3) <= 0) { // 123
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } else if (num1.compareTo(num2) <= 0 && num3.compareTo(num2) <= 0) { // 132
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        } else if (num2.compareTo(num1) <= 0 && num1.compareTo(num3) <= 0) { // 213
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        } else if (num2.compareTo(num3) <= 0 && num3.compareTo(num1) <= 0) { // 231
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        } else if (num3.compareTo(num1) <= 0 && num1.compareTo(num2) <= 0) { // 312
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        } else if (num3.compareTo(num2) <= 0 && num2.compareTo(num1) <= 0) { // 321
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
        /*
         * 1 2 3
         * 1 3 2
         * 2 1 3
         * 2 3 1
         * 3 1 2
         * 3 2 1
         */
    }
}