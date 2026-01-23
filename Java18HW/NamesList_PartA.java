
//Made by Georgio.
import java.util.ArrayList;
import java.util.Scanner;

public class NamesList_PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.print("Please enter a name or 'q' to quit: ");
            String name = in.nextLine();
            if (name.charAt(0) == 'q') {
                break;
            }
            names.add(name);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
