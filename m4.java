import java.util.Scanner;
public class m4 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

System.out.println("Enter N1:");
int x=s.nextInt();
System.out.println("Enter N2:");
int y=s.nextInt();
System.out.println("Enter M:");
int p=s.nextInt();
System.out.println(" ");

int c=0;

System.out.println("Numbers divisble by " +p);
for (; x<=y; x++)
{
if (x%p==0) 
{System.out.println(x);
c++;
}
}

System.out.println(" ");
System.out.println("The count of number divisible by it is: " +c);
}
}