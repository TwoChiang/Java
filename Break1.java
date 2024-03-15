import java.util.Scanner;
public class Break1{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long x;
    int i;
    String convert;

    Scanner num = new Scanner(System.in);

    System.out.println(" Enter a number: ");
    x = num.nextLong();

    convert = String.valueOf (x);


    for(i = 0; i < convert.length(); i++)
    {
        System.out.println(convert.charAt (i));

    }
    }
}