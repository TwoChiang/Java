import java.util.Scanner;
public class MyDate {

    int month;
    int day;
    int year;

   public MyDate  (int month ,int  day , int year ) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public int getMonth()
        {
            return month;
        }
    public int getDay()
    {
        return day;
    }
    public int getYear()
    {
        return year;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month");
       int m = sc.nextInt();
        System.out.println("Enter Day");
       int d = sc.nextInt();
        System.out.println("Enter Year");
       int y = sc.nextInt();
        MyDate  Man = new MyDate (m,d,y);
        System.out.println(Man.day + " " + Man.month + " " + Man.year);
    }

}

