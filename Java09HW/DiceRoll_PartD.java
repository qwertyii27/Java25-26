
// By Georgio.
import java.util.Scanner;

public class DiceRoll_PartD {
    public static void main(String[] args) {
        // vars and all of that
        char input = 'o';
        int roll = 1;
        Scanner in = new Scanner(System.in);

        while (input != 'q') { // quit case and also loop
            System.out.print("Enter 'r' to roll, 'd' to display, or 'q' to quit:");
            input = in.next().charAt(0);
            if (input == 'r') { // roll thingy
                roll = (int) ((Math.random() * (6)) + 1); // i got the idea for this math from elsewhere.
                System.out.println(roll);
            }
            if (input == 'd') { // display thingy
                System.out.println("Entering display test.");
                switch (roll) { // i just copied these dice from the document lol
                    case 1:
                        System.out.println("+-------+\n" + //
                                "|       |\n" + //
                                "|   0   |\n" + //
                                "|       |\n" + //
                                "+-------+\n" + //
                                "");
                        break;
                    case 2:
                        System.out.println("+-------+\n" + //
                                "|     0 |\n" + //
                                "|       |\n" + //
                                "| 0     |\n" + //
                                "+-------+\n" + //
                                "");
                        break;
                    case 3:
                        System.out.println("+-------+\n" + //
                                "|     0 |\n" + //
                                "|   0   |\n" + //
                                "| 0     |\n" + //
                                "+-------+\n" + //
                                "");
                        break;

                    case 4:
                        System.out.println("+-------+\n" + //
                                "| 0   0 |\n" + //
                                "|       |\n" + //
                                "| 0   0 |\n" + //
                                "+-------+\n" + //
                                "");
                        break;
                    case 5:
                        System.out.println("+-------+\n" + //
                                "| 0   0 |\n" + //
                                "|   0   |\n" + //
                                "| 0   0 |\n" + //
                                "+-------+\n" + //
                                "");
                        break;
                    case 6:
                        System.out.println("+-------+\n" + //
                                "| 0   0 |\n" + //
                                "| 0   0 |\n" + //
                                "| 0   0 |\n" + //
                                "+-------+\n" + //
                                "");
                        break;
                }

            }
        }
        in.close();
    }
}
