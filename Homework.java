import java.util.Scanner;
    import javax.swing.JOptionPane;

    public class Homework
    {
        public static void main(String[] args) 
        {
            String quantity;
            quantity = JOptionPane.showInputDialog("Enter quantity of your first item");
            String price1;
            price1 = JOptionPane.showInputDialog("Enter the total cost of your first item");
            String description;
            description = JOptionPane.showInputDialog("Enter description of your first item");
            String quantity2;
            quantity2 = JOptionPane.showInputDialog("Enter quantity of second item");
            String price2;
            price2 = JOptionPane.showInputDialog("Enter the total cost of your second item");
            String description2;
            description2 = JOptionPane.showInputDialog("Enter description of your second item");
            JOptionPane.showMessageDialog(null, "Thank you for your order");

        }
    }