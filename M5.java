import java.util.Scanner;
public class M5 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

System.out.println("PIZZA!");

System.out.println("Domino's three options:");
System.out.println("10 inches for 178 pesos");
System.out.println("12 inches for 259 pesos");
System.out.println("14 inches for 314 pesos");
System.out.println(" ");

System.out.println("Enter diameter of the pizza :");
double size = s.nextInt();
System.out.println("Enter the price :");
double price = s.nextInt();
System.out.println(" ");

double radius, area;
radius = size/2;
area = 3.14 * radius * radius;

System.out.println("Area of the pizza :" +area);
double price2;
price2 = price/area;
System.out.println("Price per square inch of the pizza :" +price2);
System.out.println(" ");

System.out.println("The area of the pizza for the 10 inch pizza is:");
System.out.println("78.5");
System.out.println("The price per square inch of the 10 inch pizza is:");
System.out.println("2.27");
System.out.println(" ");

System.out.println("The area of the pizza for the 12 inch pizza is:");
System.out.println("113.04");
System.out.println("The price per square inch of the 12 inch pizza is:");
System.out.println("2.29");
System.out.println(" ");

System.out.println("The area of the pizza for the 14 inch pizza is:");
System.out.println("153.86");
System.out.println("The price per square inch of the 14 inch pizza is:");
System.out.println("2.04");
}
}



