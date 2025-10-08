import java.util.Scanner;

public class NameAsk {
    public static void main(String[] args) {
        Scanner iAmGoingToPunchABrickWall = new Scanner(System.in);
        //Asks for name
        System.out.println("Enter your name: ");
        String name = iAmGoingToPunchABrickWall.nextLine();
        System.out.println("Hello " + name + "!");
        iAmGoingToPunchABrickWall.close();
    }
}