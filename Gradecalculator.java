import java.util.Scanner;
public class gradecalculator {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

System.out.println("Enter student's name :");
    String studentname = s.next();
System.out.println("Enter student's number :");
    String studentnumber = s.next();
System.out.println("Enter student's course :");
    String studentcourse = s.next();
System.out.println("Enter student's college :");
    String studentcollege = s.next();
System.out.println("Enter student's subject :");
    String studentsubject = s.next();
System.out.println("Enter student's semester :");
    String studentsemester = s.next();
System.out.println("Enter student's school year :");
    String studentschoolyear = s.next();

System.out.println(" ");
System.out.println("PRELIM PERIOD (LECTURE)");

System.out.println("Enter Quiz 1 scores :");
double q1 = s.nextInt();
System.out.println("Enter Quiz 2 scores :");
double q2 = s.nextInt();
System.out.println("Enter Class standing :");
double cs = s.nextInt();
System.out.println("Enter Prelim Exam :");
double pe = s.nextInt();
System.out.println(" ");

double averageplg = (q1 + q2) * .40;
double csplg = cs * .20;
double peplg = pe * .40;
double plecg = averageplg + csplg + peplg;
System.out.println("Prelim Lecture Grade: "+plecg);
System.out.println(" ");

System.out.println("PRELIM PERIOD (LABORATORY)");
System.out.println("Average Grade of Lab Activities :");
double ppagla = s.nextInt();
System.out.println("Prelim Lab Exam :");
double ple = s.nextInt();

double averagegla = ppagla * .60;
double prelimle = ple * .40;
double plabg = averagegla + prelimle;
double pg = (plecg * .60) + (plabg * .40);
System.out.println("Prelim Lab Grade: "+plabg);
System.out.println("Prelim Grade: "+pg);
System.out.println(" ");

System.out.println("FINALS PERIOD (LECTURE)");
System.out.println("Enter Q3 score :");
double q3 = s.nextInt();
System.out.println("Enter Q4 score :");
double q4 = s.nextInt();
System.out.println("Enter Class Standing (FINAL PERIOD) :");
double fpcs = s.nextInt();
System.out.println("Enter Final Lecture Exam score :");
double flece = s.nextInt();
System.out.println(" ");

double averageqthreeqfour = (q3 + q4) * .40;
double fpclassstanding = fpcs * .20;
double finallecexam = flece * .40;
double flecg = averageqthreeqfour + fpclassstanding + finallecexam;
System.out.println("Finals Lecture Grade: "+ flecg);
System.out.println(" ");

System.out.println("FINALS PERIOD (LABORATORY)");
System.out.println("Average Grade of Lab Activities :");
double fpagla = s.nextInt();
System.out.println("Final Lab Exam :");
double flabe = s.nextInt();

double fplabgrade = (fpagla * .60) + (flabe * .40);
double fpgrade = (flecg * .60) + (fplabgrade * .40);

System.out.println("Finals Lab Grade: "+ fplabgrade);
System.out.println(" ");

System.out.println("Finals Grade: "+ fpgrade);
System.out.println(" ");

double semestralgrade = (pg * .50) + (fpgrade * .50);
System.out.println("Semestral Grade : "+ semestralgrade);
System.out.println(" ");

  if (semestralgrade <= 100 && semestralgrade >= 96) {
       System.out.println("Grade Equivalent: 1.00");
System.out.println(" ");
System.out.println("Remarks : Excellent!");

      } if (semestralgrade <= 95.99 && semestralgrade >= 93) {
       System.out.println("Grade Equivalent: 1.25");
System.out.println(" ");
System.out.println("Remarks : Very Good!");

      } if (semestralgrade <= 92.99 && semestralgrade >= 90) {
       System.out.println("Grade Equivalent: 1.50");
System.out.println(" ");
System.out.println("Remarks : Very Good!");

      } if (semestralgrade <= 89.99 && semestralgrade >= 87) {
       System.out.println("Grade Equivalent: 1.75");
System.out.println(" ");
System.out.println("Remarks : Very Good!");

      } if (semestralgrade <= 86.99 && semestralgrade >= 84) {
       System.out.println("Grade Equivalent: 2.00");
System.out.println(" ");
System.out.println("Remarks : Good");

      } if (semestralgrade <= 83.99 && semestralgrade >= 80) {
       System.out.println("Grade Equivalent: 2.25");
System.out.println(" ");
System.out.println("Remarks : Good");

      } if (semestralgrade <= 79.99 && semestralgrade >= 78) {
       System.out.println("Grade Equivalent: 2.50");
System.out.println(" ");
System.out.println("Remarks : Fair");

      } if (semestralgrade <= 77.99 && semestralgrade >= 76) {
       System.out.println("Grade Equivalent: 2.75");
System.out.println(" ");
System.out.println("Remarks : Fair");

      } if (semestralgrade <= 75.99 && semestralgrade >= 75 ) {
       System.out.println("Grade Equivalent: 3.00");
System.out.println(" ");
System.out.println("Remarks : Passed -_-");

      } if (semestralgrade <= 74.99 && semestralgrade >= 0) {
       System.out.println("Grade Equivalent: 5.00");
System.out.println(" ");
System.out.println("Remarks : FAILED! :(");

      }
}
}