import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.*;
public class Gui
{
	public static void main(String[]args)
	{
		JFrame x = new JFrame ("Calculation of Property Taxes");
		x.setSize(400,300);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setLayout(new GridLayout(7,2));
		x.add(new JLabel("Assessed Home Value"));
		x.add(new JTextField());
		x.add(new JLabel("Decimal Value of School Tax Rate"));
		x.add(new JTextField());
		x.add(new JLabel("Decimal Value of Country Tax Rate"));
		x.add(new JTextField());
		x.add(new JLabel("School Taxes: "));
		x.add(new JTextField());
		x.add(new JLabel("Country Taxes: "));
		x.add(new JTextField());
		x.add(new JLabel("Total Taxes: "));
		x.add(new JTextField());
		x.add(new JButton("Calculate"));
		x.add(new JButton("Exit"));
		x.setVisible(true);
	}
}

