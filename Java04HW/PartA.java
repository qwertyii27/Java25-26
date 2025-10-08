// By Georgio Tournas. Asks for input and accounts for accounts with balances.

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        // Declare variables and scanner
        Scanner in = new Scanner(System.in);
        double accBal1;
        double accBal2;
        double accBal3;
        int accID1;
        int accID2;
        int accID3;
        int testID = 2033942;
        double testBal = 903.38;

        // Get user input
        System.out.print("Enter the first account ID:");
        accID1 = in.nextInt();
        System.out.print("Enter the first account balance:");
        accBal1 = in.nextDouble();
        System.out.print("Enter the second account ID:");
        accID2 = in.nextInt();
        System.out.print("Enter the second account balance:");
        accBal2 = in.nextDouble();
        System.out.print("Enter the third account ID:");
        accID3 = in.nextInt();
        System.out.print("Enter the third account balance:");
        accBal3 = in.nextDouble();

        // Print
        System.out.printf("Account #%010d has a balance of $%10.2f%n", accID1, accBal1);
        System.out.printf("Account #%010d has a balance of $%10.2f%n", accID2, accBal2);
        System.out.printf("Account #%010d has a balance of $%10.2f%n", accID3, accBal3);
    }
}

// Enter the first account ID: 10023
// Enter the account balance for ID=010023($):999999999.99
// Enter the second account ID:802
// Enter the account balance for ID=000802($):107345.22
// Enter the third account ID:8
// Enter the account balance for ID=000008($):2004.28

// Account#010023 has a balance of $999999999.99
// Account#000802 has a balance of $107345.22
// Account#000008 has a balance of $2004.28
