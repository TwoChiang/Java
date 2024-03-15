import java.util.Scanner;
public class Distance {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		float time;
		float mps,kph, mph;

		System.out.print("Enter distance in meters: ");
		float distance = sc.nextFloat();
		System.out.print("Enter hour: ");
		float hr = sc.nextFloat();
		System.out.print("Enter minutes: ");
		float min = sc.nextFloat();
		System.out.print("Enter seconds: ");
		float sec = sc.nextFloat();

		time = (hr*3600) + (min*60) + sec;
		mps = distance / time;
		kph = ( distance/1000.0f ) / ( time/3600.0f );
		mph = kph / 1.609f;

		System.out.println("Your speed in meters/second is "+mps);
		System.out.println("Your speed in km/h is "+kph);
		System.out.println("Your speed in miles/h is "+mph);
	}
}