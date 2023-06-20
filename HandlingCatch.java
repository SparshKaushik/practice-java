import javax.swing.JOptionPane;

public class HandlingCatch {
    public static void main(String[] args) {
        try {
            String s = JOptionPane.showInputDialog("Enter a number");
            int n = Integer.parseInt(s);
            System.out.println("Number: " + n);
            System.out.println("Square: " + n * n);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }
}