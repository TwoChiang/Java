import java.util.*;
class Calculation { //Superclass
    int z;

   public void addition(int x, int y) { 
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }

   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }

public class My_Calculation extends Calculation {//inherits from the class Calculation
    Public void division(int x, int y)  {
        z = x / y;
        System.out.println("The quotient of the given numbers:"+z);
    }

   public static void main(String args[]) {
       My_Calculation obj= new My_Calculation();
      int a = 20, b = 10;

      obj.addition(a, b);
      obj.Subtraction(a, b);
   }
}