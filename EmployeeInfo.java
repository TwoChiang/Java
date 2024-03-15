import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class EmployeeInfo extends JFrame
{
    private static final int WIDTH = 600;
    private static final int HEIGHT = 300;

    private JLabel employeeName, dependents, healthInsurance, unionDues, space, space2;
    private JTextField employeeNameTF, dependentsTF, healthInsuranceTF, unionDuesTF,
            dependentsTF2, healthInsuranceTF2, unionDuesTF2;
    private JButton submitB, exitB;
    private SubmitButtonHandler sbHandler;
    private ExitButtonHandler ebHandler;

    public EmployeeInfo()
    {
        setTitle("Employee Information");

        employeeName = new JLabel("Employee Name: ", SwingConstants.RIGHT);
        dependents = new JLabel("Number of Dependents: ", SwingConstants.RIGHT);
        healthInsurance = new JLabel("Health Insurance 1 self, 2 family: ", SwingConstants.RIGHT);
        unionDues = new JLabel("Union Dues 0 no, 1 yes: ", SwingConstants.RIGHT);
        space = new JLabel(" ");
        space2 = new JLabel(" ");

        employeeNameTF = new JTextField(10);
        dependentsTF = new JTextField(10);
        healthInsuranceTF = new JTextField(10);
        unionDuesTF = new JTextField(10);

        dependentsTF2 = new JTextField(10);
        healthInsuranceTF2 = new JTextField(10);
        unionDuesTF2 = new JTextField(10);

        submitB = new JButton("Sumbit");
        sbHandler = new SubmitButtonHandler();
        submitB.addActionListener(sbHandler);

        exitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        exitB.addActionListener(ebHandler);

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5, 3));

        pane.add(employeeName);
        pane.add(employeeNameTF);
        pane.add(space);
        pane.add(dependents);
        pane.add(dependentsTF);
        pane.add(dependentsTF2);
        pane.add(healthInsurance);
        pane.add(healthInsuranceTF);
        pane.add(healthInsuranceTF2);
        pane.add(unionDues);
        pane.add(unionDuesTF);
        pane.add(unionDuesTF2);
        pane.add(space2);
        pane.add(submitB);
        pane.add(exitB);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class SubmitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int dependents, healthInsurance, unionDues, monthlyInsurance, monthlyDues;

            dependents = Integer.parseInt(dependentsTF.getText()) + 1;
            healthInsurance = Integer.parseInt(healthInsuranceTF.getText());
            unionDues = Integer.parseInt(unionDuesTF.getText());

            if (healthInsurance == 1)
                monthlyInsurance = 75;
            else if (healthInsurance == 2)
                monthlyInsurance = 150;
            else
                monthlyInsurance = 0;

            if (unionDues == 1)
                monthlyDues = 30;
            else
                monthlyDues = 0;

            dependentsTF2.setText(dependents + " Deductions Counting Employee");
            healthInsuranceTF2.setText("Monthly Insurance $" + monthlyInsurance);
            unionDuesTF2.setText("Monthly Union Dues $" + monthlyDues);
        }
    }

    private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        EmployeeInfo eiObject = new EmployeeInfo();
    }
}