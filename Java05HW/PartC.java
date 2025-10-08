
/* Made by Georgio. Uses dialog options as well as static methods of the Integer class 
to produce name and age.
 */
import javax.swing.JOptionPane;

public class PartC {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        int yearNow = Integer.valueOf(JOptionPane.showInputDialog("Please enter the current year:"));
        int yearBirth = Integer.valueOf(JOptionPane.showInputDialog("Please enter your birth-year:"));
        String age = Integer.toString(yearNow - yearBirth);

        JOptionPane.showMessageDialog(null, "Your name is " + name + " and your age is " + age + ".");
    }
}
