import javax.swing.JOptionPane;

public class DialogBox {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Enter your Name!");
        System.out.printf("USER ENTERED \"%s\"%n", firstName);
        JOptionPane.showMessageDialog(null, "Your name is: " + firstName);
    }
}