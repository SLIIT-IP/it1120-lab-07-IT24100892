import java.util.Scanner;
public class IT24100892Lab7Q1A
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int i;
		int sum = 0 ;
		int number;
		double avg ;
		
		System.out.println("Enter the marks for subjets: ");
		for(i = 0; i<4; i++)
		{
			System.out.print("Enter subject mark "+(i +1)+": ");
			number = input.nextInt();
			sum = sum + number;
			
		}
		avg = sum/i;	
		System.out.println("Average is : "+avg);
		if(avg>=75 && avg<=100)

			{System.out.println("Overall Grade is : Distinction");}

		else if(avg>=50 && avg<=74)

			{System.out.println("Overall Grade is : Credit");}

		else
			{System.out.println("Overall Grade is : Fail");}
		
	}
}