import java.util.Scanner;
import java.util.*;

class parameterized 
{
    public static void main(String[] args)
    {
		
        try (Scanner sc = new Scanner (System.in);) //using Scanner as the parameter for try 
        {
			System.out.println ("Enter an integer:");
			int i = sc.nextInt(); // variable i will thrown
            
        }
        catch (InputMismatchException e) // error class 
        {
            System.out.println ("You didn't enter an integer"); // variable i will be caught here 
														// it will be tested if it is an error mismatch
        }
        finally 
        {
            System.out.println ("Program is working"); // finally block will executed
        }
    }
}