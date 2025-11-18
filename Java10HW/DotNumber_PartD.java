//Made by Georgio. No AI, no help.
public class DotNumber_PartD {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // "i" is the variable for the line number.
            for (int n = 4; n >= i; n--) { // adds less periods per line.
                System.out.print(".");
            }
            for (int n = 1; n <= i; n++) { // adds more numbers per line.
                System.out.print(i); // number will be line number, starting from 1.
            }
            System.out.println();
        }
    }
}
