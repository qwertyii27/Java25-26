
// By Georgio
/* Note: Instead of finding the more elegant solution, it looks like last week 
i came up with some sort of abomination. At least it works! */
import java.util.Scanner;

public class PartD_Numerals {
    public static void main(String[] args) {
        int input;
        int compute1 = 0;
        int compute2 = 0;
        int compute3 = 0;
        int compute4 = 0;
        String numeral = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Please input a number between 1 and 3999: ");
        if (!in.hasNextInt()) { // test for runtime errors
            System.err.printf("ERROR: Not an integer. %n Terminating program.");
            return;
        } else {
            input = in.nextInt();
        }
        if (input <= 0 || input > 3999) { // test for logic errors
            System.err.printf("ERROR: Not between 1 and 3999. %n Terminating program.");
            return;
        } else { // Run if there are no errors
            if (Integer.toString(input).length() == 4) { // compute digits. spaghetti code
                compute1 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(3)));
                compute2 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(2)));
                compute3 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(1)));
                compute4 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(0)));
            }
            if (Integer.toString(input).length() == 3) {
                compute1 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(2)));
                compute2 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(1)));
                compute3 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(0)));
                compute4 = 0;

            }
            if (Integer.toString(input).length() == 2) {
                compute1 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(1)));
                compute2 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(0)));
                compute3 = 0;
                compute4 = 0;
            }
            if (Integer.toString(input).length() == 1) {
                compute1 = Integer.parseInt(String.valueOf(Integer.toString(input).charAt(0)));
            }
            switch (compute4) {
                case 1:
                    numeral = numeral + "M";
                    break;
                case 2:
                    numeral = numeral + "MM";
                    break;
                case 3:
                    numeral = numeral + "MMM";
                    break;
            }
            switch (compute3) {
                case 1:
                    numeral = numeral + "C";
                    break;
                case 2:
                    numeral = numeral + "CC";
                    break;
                case 3:
                    numeral = numeral + "CCC";
                    break;
                case 4:
                    numeral = numeral + "CD";
                    break;
                case 5:
                    numeral = numeral + "D";
                    break;
                case 6:
                    numeral = numeral + "DC";
                    break;
                case 7:
                    numeral = numeral + "DCC";
                    break;
                case 8:
                    numeral = numeral + "DCCC";
                    break;
                case 9:
                    numeral = numeral + "CM";
                    break;
                default:
                    break;
            }
            switch (compute2) {
                case 0:
                    break;
                case 1:
                    numeral = numeral + "X";
                    break;
                case 2:
                    numeral = numeral + "XX";
                    break;
                case 3:
                    numeral = numeral + "XXX";
                    break;
                case 4:
                    numeral = numeral + "XL";
                    break;
                case 5:
                    numeral = numeral + "L";
                    break;
                case 6:
                    numeral = numeral + "LX";
                    break;
                case 7:
                    numeral = numeral + "LXX";
                    break;
                case 8:
                    numeral = numeral + "LXXX";
                    break;
                case 9:
                    numeral = numeral + "XC";
                    break;
                default:
                    break;
            }
            switch (compute1) {
                case 1:
                    numeral = numeral + "I";
                    break;
                case 2:
                    numeral = numeral + "II";
                    break;
                case 3:
                    numeral = numeral + "III";
                    break;
                case 4:
                    numeral = numeral + "IV";
                    break;
                case 5:
                    numeral = numeral + "V";
                    break;
                case 6:
                    numeral = numeral + "VI";
                    break;
                case 7:
                    numeral = numeral + "VII";
                    break;
                case 8:
                    numeral = numeral + "VIII";
                    break;
                case 9:
                    numeral = numeral + "IX";
                    break;
            }
            System.out.println(numeral);
        }
    }
}
