import java.util.Scanner;
public class Integer1{
    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);
		int num,sum;

        System.out.print("Enter an integer between 0 and 1000: ");
        num = sc.nextInt();

        int ones = num % 10;
        int tens = (num/10) % 10;
        int hundreds = (num/100) % 10;
        
        sum = ones + tens + hundreds;
        System.out.println("The sum of all digits in " + num + " is " + sum);
    }
}