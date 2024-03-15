import java.util.Scanner;
public class Common {
    public static void main (String x[])
    {
        Scanner input1 = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        Scanner input3 = new Scanner (System.in);
        int size;
        
        System.out.print ("Enter array size you want for both arrays: ");
        size = input3.nextInt();
        String [] a = new String [size];
        String [] b = new String [size];
        
        System.out.println ("Input values for array 1:");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = input1.nextLine();
        }
        System.out.println ("Input values for array 2:");
        for (int i = 0; i < b.length; i++)
        {
            b[i] = input2.nextLine();
        }
        
        
        System.out.println ("The common elements are: ");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if ( a[i].equals(b[j]) )
                {
                    System.out.println (a[i]);
                }
            }
        }
        
        
        
    }
}