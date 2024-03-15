import java.util.Scanner;
public class Integers {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd num: ");
        int num2 = in.nextInt();

        int Sum, Diff, Prod, Quo, Ave, Dist;

        Sum = num1+num2;
        Diff = num1-num2;
        Prod = num1*num2;
        Quo = num1/num2;
        Ave = (num1+num2)/2;
        Dist = num1-num2;

        System.out.println("Sum: " + Sum);
        System.out.println("Difference:" + Diff);
        System.out.println("Product:" + Prod);
        System.out.println("Average: " + Quo);
        System.out.println("Distance: " + Ave);
        if(num1 > num2){
            System.out.println("Max integer: " + num1);
            System.out.println("Minimum integer: " + num2);
        } else
        {
            System.out.println("Max integer: " + num2);
            System.out.println("Minimum integer: " + num1);
        }
    }
}