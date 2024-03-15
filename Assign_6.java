import java.util.*;
    class Assign_6

{

public static void main(String[]args)
{
    System.out.println("Enter the number upto which you want to print the perfect number");
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();

    for(int i=1;i<=n;i++)
    {
        int sum=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            sum=sum+j;
        }
        if(sum==(2*i))  //checks for perfect number
        System.out.println(i);
    }

    }
}