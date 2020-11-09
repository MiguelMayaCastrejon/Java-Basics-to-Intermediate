import javax.swing.JOptionPane;

public class DataEntry2 {
    /* 
    * Data entry using JOptionPane.
    */
    public static void main(String[] args) {

        String string;
        int integer;
        char letter;
        double decimal;

        string = JOptionPane.showInputDialog("Please enter a string.");
        integer = Integer.parseInt(JOptionPane.showInputDialog("Please enter a integer."));
        letter = JOptionPane.showInputDialog("Please enter a letter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Please enter a decimal."));

        JOptionPane.showMessageDialog(null, "The string is: " + string);
        JOptionPane.showMessageDialog(null, "The integer is: " + integer);
        JOptionPane.showMessageDialog(null, "The letter is: " + letter);
        JOptionPane.showMessageDialog(null, "The decimal is: " + decimal);



    }
}
