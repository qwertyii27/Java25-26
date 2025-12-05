//Made by Georgio. No AI or outside help, but I refrenced my earlier HW.
// Keep rolling dice until they are the same, displaying results.

public class DiceCheck02 {
    public static void main(String[] args) {
        int dice1, dice2;
        boolean same = false;

        while (!same) {
            dice1 = (int) ((Math.random() * (6)) + 1); // used my code from the past..
            dice2 = (int) ((Math.random() * (6)) + 1);
            System.out.printf("%d %d %n", dice1, dice2);

            if (dice1 == 1) {
                System.out.println("+-------+\n" + //
                        "|       |\n" + //
                        "|   0   |\n" + //
                        "|       |\n" + //
                        "+-------+\n" + //
                        "");
            } else if (dice1 == 2) {
                System.out.println("+-------+\n" + //
                        "|     0 |\n" + //
                        "|       |\n" + //
                        "| 0     |\n" + //
                        "+-------+\n" + //
                        "");
            } else if (dice1 == 3) {
                System.out.println("+-------+\n" + //
                        "|     0 |\n" + //
                        "|   0   |\n" + //
                        "| 0     |\n" + //
                        "+-------+\n" + //
                        "");

            } else if (dice1 == 4) {
                System.out.println("+-------+\n" + //
                        "| 0   0 |\n" + //
                        "|       |\n" + //
                        "| 0   0 |\n" + //
                        "+-------+\n" + //
                        "");

            } else if (dice1 == 5) {
                System.out.println("+-------+\n" + //
                        "| 0   0 |\n" + //
                        "|   0   |\n" + //
                        "| 0   0 |\n" + //
                        "+-------+\n" + //
                        "");

            } else if (dice1 == 6) {
                System.out.println("+-------+\n" + //
                        "| 0   0 |\n" + //
                        "| 0   0 |\n" + //
                        "| 0   0 |\n" + //
                        "+-------+\n" + //
                        "");
            }

            if (dice2 == 1) {
                System.out.println("+-------+\n" + //
                        "|       |\n" + //
                        "|   0   |\n" + //
                        "|       |\n" + //
                        "+-------+\n" + //
                        "");
            } else if (dice2 == 2) {
                System.out.println("+-------+\n" + //
                        "|     0 |\n" + //
                        "|       |\n" + //
                        "| 0     |\n" + //
                        "+-------+\n" + //
                        "");
            } else if (dice2 == 3) {
                System.out.println("+-------+\n" + //
                        "|     0 |\n" + //
                        "|   0   |\n" + //
                        "| 0     |\n" + //
                        "+-------+\n" + //
                        "");

            } else if (dice2 == 4) {
                System.out.println("+-------+\n" + //
                        "| 0   0 |\n" + //
                        "|       |\n" + //
                        "| 0   0 |\n" + //
                        "+-------+\n" + //
                        "");

            } else if (dice2 == 5) {
                System.out.println("+-------+\n" + //
                        "| 0   0 |\n" + //
                        "|   0   |\n" + //
                        "| 0   0 |\n" + //
                        "+-------+\n" + //
                        "");

            } else if (dice2 == 6) {
                System.out.println("+-------+\n" + //
                        "| 0   0 |\n" + //
                        "| 0   0 |\n" + //
                        "| 0   0 |\n" + //
                        "+-------+\n" + //
                        "");
            }
            if (dice1 == dice2) {
                System.out.println("These are the same!");
                same = true;
                break;
            } else {
                System.out.println("-----------------------");
            }
        }

    }
}
