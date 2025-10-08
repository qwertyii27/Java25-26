
// By Georgio. Makes a monogram of first middle last names
import javax.swing.JOptionPane;

public class PartA {
    public static void main(String[] args) {
        // Get names
        String nameFirst = JOptionPane.showInputDialog("Enter your first name: ");
        String nameMiddle = JOptionPane.showInputDialog("Enter your middle name: ");
        String nameLast = JOptionPane.showInputDialog("Enter your last name: ");

        // Get characters
        char first = (char) nameFirst.charAt(0);
        char middle = (char) nameMiddle.charAt(0);
        char last = (char) nameLast.charAt(0);

        // Uppercase characters
        char fUpper = Character.toUpperCase(first);
        char mUpper = Character.toUpperCase(middle);
        char lUpper = Character.toUpperCase(last);

        JOptionPane.showMessageDialog(null, "Your name's acronym is:" + fUpper + mUpper + lUpper);
    }

}