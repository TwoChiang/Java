import java.util.Scanner;
public class array{
	public static void main (String[]args){
	int x;
	Scanner sc = new Scanner(System.in);
	System.out.println("input how many asterisk to use: ");
	x = sc.nextInt();

	for(int i = 0; i < x; i++){
	System.out.print(" ");
	}

	System.out.println(" "+"*");

	for(int i = 0; i < x; i++){
	System.out.print(" ");
	}

	System.out.println("*"+" "+"*");

	System.out.print(" ");

	for(int i = 0; i < x; i ++){
	System.out.print(" ");
	System.out.print("*");
	}
	System.out.println(" ");
	for(int i = 0; i < x; i++){
	System.out.print(" ");
	}

	System.out.println("*"+" "+"*");

	for(int i = 0; i < x; i++){
	System.out.print(" ");
	}

	System.out.println(" "+"*");
	}
}