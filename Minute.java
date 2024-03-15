import java.util.Scanner;
public class Minute{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of minutes:");
    int minutes = sc.nextInt();

    int year = minutes / 525600;
    int remainingMinutes = minutes % 525600;
    int day = remainingMinutes / 1440;

    System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
    }

   }