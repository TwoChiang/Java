import java.util.Scanner;
public class Diagonal{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	long x;
	int i;
	String convert;
	/* Ung word na convert dito, word lang ba or may function na sya ? */
	String sp = " ";
	Scanner num = new Scanner(System.in);
	/* So pwede mag assign ng kahit anong character pang scanner ? walang problem if "sc" or "cs" or etc.. */
	System.out.println(" Enter a number: ");
	x = num.nextLong();
	/* So ung ininput is "long" muna ung data type */
	convert = String.valueOf (x);
	/* Ung value ng word na "convert" magiging ung inputted data ? */

	for(i = 0; i < convert.length(); i++)
	{
		System.out.println(" "+ sp + convert.charAt (i));
		sp += " ";
		/* So dito sinasabi na mag iincrement ung space tapos dedeclare nya ung inputted data isa-isa ? */
		/* Diba ung output line by line, edi ba kapag "i++", add one lang ng add one, 
		Pano Automatic na ba pagincrement nung space*/
	}
	}
}