import java.util.Scanner;
public class Element{
	public static void main (String [] args){
	
	 Scanner input = new Scanner (System.in);
	 System.out.println ("Input array size:");
	 int size = input.nextInt();
	 int[] arr = new int [size];
	 System.out.println ("Input " + size + " integer values:");
	 
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = input.nextInt();
		}
		
		System.out.println ("The elements in the array are: ");
		for (int output: arr)
		{
		System.out.print (output + "   ");
		}
		
		for (int j = 0; j < arr.length; j++)   
        {  
            for (int k = j + 1; k < arr.length; k++)   
            {  
				 int secondlargest = 0;
                if (arr[k] > arr[k])   
                {  
                    secondlargest = arr[j];  
                    arr[j] = arr[k];  
                    arr[k] = secondlargest;  
                }  
            }  
        } 	
		System.out.println ();
        System.out.println ("The second largest element in the array is: " + arr[arr.length - 2]);
	   
	}
}