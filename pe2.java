import java.util.Scanner;
 
public class pe2 {
private static Scanner sc;

public static void main(String[] args) {

sc = new Scanner(System.in);		
System.out.println("\n Please Enter any Number: ");
int n = sc.nextInt();

int intArrayd[];
intArrayd = new int[1000];

for(int i = 1 ; i <= n ; i++)
{
int sum = 0;
for(int j = 1 ; j <= i ; j++)
{
if(i % j == 0)
sum = sum + j;
}
if (sum < (2*i))
System.out.println("deficient" +i);

else (sum == (2*i))
System.out.println("perfect" +i);

else (sum > (2*i))
System.out.println("abundant" +i);
}


}
}
