import java.util.*;
public class assertion {
   public static void main(String[] args) {
      char operator = '%';
      // possible operators are: '+', '-', '*', '/' only
      int operand1 = 5, operand2 = 6, result = 0;
      switch (operator) {
         case '+': result = operand1 + operand2; break;
         case '-': result = operand1 - operand2; break;
         case '*': result = operand1 * operand2; break;
         case '/': result = operand1 / operand2; break;
         default: assert false : "Unknown operator: " + operator;// not plausible here
      }
      System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
   }
}