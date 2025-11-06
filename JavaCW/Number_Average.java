import java.util.Scanner;

public class Number_Average {
    public static void main(String[] args) {
        double input = 0, total = 0;
        int e = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please input the apple's weight in ounces: ");
            if (!in.hasNextDouble()) {
                if (in.hasNext("q")) {
                    break;
                }
                System.out.println("Not a double.");
                continue;
            }
            input = in.nextDouble();
            total += input;
            e++;
        }
        System.out.println(total / e);
        in.close();
    }
}
