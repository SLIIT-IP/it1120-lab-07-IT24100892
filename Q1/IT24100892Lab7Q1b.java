import java.util.Scanner;
public class IT24100892Lab7Q1b
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  double mark1,mark2,mark3,mark4,avg;
 
 for(int student =1; student <= 3; student++)
 {
   System.out.println("student " +student);
   
   System.out.print("Enter Marks :");
   mark1=sc.nextDouble();   
   mark2=sc.nextDouble();
   mark3=sc.nextDouble();
   mark4=sc.nextDouble();

  
 
  avg= (mark1 + mark2 + mark3 + mark4)/4;
 
  System.out.println("Average is : " + avg);

   if(avg>=75 && avg<=100)
    { 
     System.out.println("Overall Grade is : Distinction");
    }
  
   else if(avg>=50 && avg<=74)
   { 
     System.out.println("Overall Grade is : Credit");
    }
   else 
   { 
     System.out.println("Overall Grade is : Fail");
    }
   System.out.println(" ");
   
  }
   
   
 }
}