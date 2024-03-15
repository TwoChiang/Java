import java.util.Scanner;
public class Equality {
	public static void main (String [] args) {
	 Scanner input = new Scanner (System.in);
	 Scanner input2 = new Scanner (System.in);
	 Scanner input3 = new Scanner (System.in);
	 System.out.println ("Enter array size for the 2 arrays to be compared:");
	 int size = input.nextInt();
	 int[] a = new int[size];
	 int[] b = new int[size];
	 
	 System.out.println ("Input values for array 1:");
		for (int i = 0; i < a.length; i++)
		{
			a[i] = input2.nextInt();
		}
		System.out.println ("Input values for array 2:");
		for (int i = 0; i < b.length; i++)
		{
			b[i] = input3.nextInt();
		}
		
		if (a.length == b.length)
		{
			boolean x = true;
			for (int i = 0; i < a.length; i++)
			{
				for (int j = 0; j < b.length; j++)
				{
						
					if (a[i] == b[j])
					{
						x = true;
					}
					else if (a[i] != b[j])
					{
						x = false;
					}
				}
			}
			System.out.println ("The 2 arrays are equal: " + x);
		}
	}
}