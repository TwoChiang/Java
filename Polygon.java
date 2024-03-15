import java.util.Scanner;

public class Polygon{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the apothem or like the radius: ");
        double apo = sc.nextDouble();
        System.out.print("Enter the number of sides: ");
        double side = sc.nextDouble();
        System.out.print("Enter the length of sides: ");
        double length = sc.nextDouble();

        double per = side*length;
        double area = (apo*per)/2;

        System.out.print("The area is: " + area);
    }
}