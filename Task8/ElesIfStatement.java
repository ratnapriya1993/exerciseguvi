package Task8;

import java.util.Scanner;

public class ElesIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int percentage = sc.nextInt();
		
		if(percentage == 100)
		{
			System.out.println("Grade S");
			
		}
		else if(percentage < 99 && percentage >= 90)
		{
			System.out.println("Grade A");
		}
		else if(percentage < 89 && percentage >= 80)
		{
			System.out.println("Grade B");
		}else if(percentage < 79 && percentage >= 70)
		{
			System.out.println("Grade C");
		}
		else if(percentage < 69 && percentage >= 60)
		{
			System.out.println("Grade D");
		}
		else if(percentage < 59 && percentage >= 50)
		{
			System.out.println("Grade E");
		}
		else if(percentage <= 50)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}	 
			
			 
			  
	

		
		
	


