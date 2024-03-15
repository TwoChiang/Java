import java.util.Scanner;
import java.util.*;

public class Kenji{
	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);

	System.out.println("INPUT:");
	String str = sc.next();
	System.out.println(str);
	System.out.println(str.length());
	int strl = str.length();

	for(int i = 0; i != (strl*2)-1 ; i++){
			System.out.print(str.charAt(0));
	}	System.out.println(str.charAt(0));

	System.out.print(str.charAt(0));
	for(int i = 0; i != (strl*2)-2 ; i++){
		System.out.print(str.charAt(1));
	}	System.out.println(str.charAt(0));

	System.out.print(str.charAt(0));
	System.out.print(str.charAt(1));
	for(int i = 0; i != (strl*2)-4 ; i++){
		System.out.print(str.charAt(2));
	}	System.out.print(str.charAt(1));
		System.out.println(str.charAt(0));

	System.out.print(str.charAt(0));
	System.out.print(str.charAt(1));
	System.out.print(str.charAt(2));
	for(int i = 0; i != (strl*2)-6 ; i++){
		System.out.print(str.charAt(3));
	}	System.out.print(str.charAt(2));
		System.out.print(str.charAt(1));
		System.out.print(str.charAt(0));
	}
}