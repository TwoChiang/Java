public class Payroll1
{
    public static void main(String[] args)
    {
        instructions();
        reportTitle();
    }

    public static void instructions()
    {
        System.out.println("\t\t\t\tInstructions for Payroll Report Program\n" +
                "This program calculates a paycheck for each employee.\n" +
                "A text file containing the following information woll be created:\n" +
                "name, pay rate, hours worked, and tax percentage to be deducted.\n\n" +
                "The program will create a report in columnar format showing the \n" +
                "employee name, hourly rate, number of hours worked, tax rate,\n" +
                "gross pay, and net pay.\n\n" +
                "After all employees are processed, totals will be displayed,\n" +
                "including total gross amount and total net pay.\n\n");
    }

    public static void reportTitle()
    {
        System.out.println("\t\t\t\t\t\t\t\t  Payroll Report\n\n\n" +
                "Employee\t\t\t   Hourly\t  Hours\t\t Tax\t  Gross\t\t  Net\n" +
                "Name\t\t\t\t\tRate\t  Worked\t Rate\t  Amount\t Amount\n" +
                "--------------------  --------  --------  --------  --------  --------");
    }
}

