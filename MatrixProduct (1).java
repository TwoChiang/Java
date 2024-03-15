/* Fudotan, John Christian B.
   CS203
   2IT-A
   Lab Exercise 0 
*/

import java.util.*;
public class MatrixProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a positive integer: ");
        int x = input.nextInt(); 
        System.out.print("Enter the nummber of rows for the first matrix: ");
        int y1 = input.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int z1 = input.nextInt();
        System.out.print("Enter the starting row for the first matrix: ");
        int a1 = input.nextInt();
        System.out.print("Enter the starting column for the first matrix: ");
        int b1 = input.nextInt(); 
        int[][] matrix1 = new int[y1][z1];
              
        for (int h = 1; h <= x; h++)
        {
            for (int i = 1; i <= x; i++)
            {
                 for (int row = h - 1; row < matrix1.length; row++)
                    {
                      for (int column = i - 1; column < matrix1[row].length; column++)
                        {
                            matrix1[row][column] = (h + a1)*(i + b1);
                        }
                    } 
            }
        }
        System.out.println("Matrix 1: ");   
        for (int[] e: matrix1)
        {
            for(int f: e)
            {
               System.out.print(f + " ");
            }
        System.out.println(" ");
        }
          
        System.out.print("Enter the nummber of rows for the second matrix: ");
        int y2 = input.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int z2 = input.nextInt();
        System.out.print("Enter the starting row for the second matrix: ");
        int a2 = input.nextInt();
        System.out.print("Enter the starting column for the second matrix: ");
        int b2 = input.nextInt(); 
        int[][] matrix2 = new int[y2][z2];
        
          for (int h = 1; h <= x; h++)
        {
            for (int i = 1; i <= x; i++)
            {
                 for (int row = h - 1; row < matrix2.length; row++)
                    {
                      for (int column = i - 1; column < matrix2[row].length; column++)
                        {
                            matrix2[row][column] = (h + a2)*(i + b2);
                        }
                    } 
            }
        }
        System.out.println("Matrix 2: ");   
        for (int[] k: matrix2)
        {
            for(int l: k)
            {
               System.out.print(l + " ");
            }
        System.out.println(" ");
        }
        System.out.println("Product of the 2 matrices is: ");
        int productRow = y1 - a1;
        int productColumn = z2 - b2;
        int[][] product = new int[productRow][productColumn];
        int value=0;
        int producttt = 0;
        for (int i = 0; i < y1; i++)
        {
            for (int j = 0; j < z2; j++)
            {
                for (int k = 0; k < z1; k++)
                {
                    producttt =+ matrix1[i][k] * matrix2[k][j];
                    value = value + producttt;
                }
               product[i][j] = value;
               value = 0;
            }
        }
         for (int[] result: product)
        {
            for(int result2: result)
            {
               System.out.print(result2 + " ");
            }
        System.out.println(" ");
        }
    }
}

