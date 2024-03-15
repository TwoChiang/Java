import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        System.out.println("Input number of arrays you would like to use");
        int x;
        int max = 0;
        int maxindex = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        int [] a = new int[x];

        for (int i = 1; i <=x ; i++)
        {
            a[i] = sc.nextInt();
            if (a[i] > max)
            {
                max = a[i];
                maxindex = i;
            }
            System.out.println("Highest number is " + max);
            System.out.println("Indexes with the highest value " + maxindex);
        }

}
}