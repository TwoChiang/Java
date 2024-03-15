import java.util.Scanner;
public class Bmi{

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.println("Body Mass Index is " + BMI);
    }
}