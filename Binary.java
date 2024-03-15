import java.util.Scanner;

public class Binary {
	public static void main (String[]args)
	{
		Scanner num = new Scanner (System.in);
		String x, y;
		int b1, b2,sum;
		
		System.out.println ("Enter 1st binary number: ");
		x = num.nextLine();
		System.out.println ("Enter 2nd binary number: ");
		y = num.nextLine();
		
		b1 = Integer.parseInt(x,2);
		b2 = Integer.parseInt(y,2);
		
		sum = b1 + b2;
		System.out.println ("The sum is: " + sum);
	}
}
		