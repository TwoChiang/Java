import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Example11 {
	//Exception Hierarchy
	/* 
	1.throw File(Test.in)
	2. caught by cactch(FileNotFound Exception)
	3. since file not then found System.out.println("file not found caught")
	4. System print out finally.
	*/
   public static void main(String[] args) {
      try {  //statements that would caught "new file" 
         System.out.println("Start of the main logic");
         System.out.println("Try opening a file ...");
         Scanner in = new Scanner(new File("test.in")); //file being caught 
         System.out.println("File Found, processing the file ...");
         System.out.println("End of the main logic");
      } catch (FileNotFoundException ex) {    // ERROR EXCEPTION1 EX
         System.out.println("File Not Found caught ...");
      } finally {   // runs the sys. print out regardless of the try-catch result
         System.out.println("finally-block runs regardless of the state of exception");
      }
      // after the try-catch-finally
      System.out.println("After try-catch-finally, life goes on...");
   }
}	