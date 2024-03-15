import java.util.*;
public class Exceptions
{ 
   public static void main(String[] args)
    {
        try (Scanner sc = new Scanner (System.in);) // parametarized try block 
        {
            System.out.println ("Enter 2 integers:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            double result = x / y;
            System.out.println (x + " / " + y + " = " + result);
        }
        catch (InputMismatchException e) // multiple exceptions in a catch block
        {
            System.out.println ("You didn't enter an integer");
        }
        catch(ArithmeticException e) // handle - declare rule 
        {
         System.out.println("You should not divide a number by zero");
        }

    }
}