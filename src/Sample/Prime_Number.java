package Sample;

import java.util.Scanner;

public class Prime_Number 
{

	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		
		int Num = scan.nextInt();
		
		int count = 0;
		
		for(int i=2; i<Num; i++)
		{
			if(Num % i == 0)
			{
				count++;
				
				break;
			}
		}
		
		if(count == 1)
		{
			System.out.println("The Number is Not a Prime Number");
		}
		
		else
		{
			System.out.println("The Number is a Prime Number");
		}
	}
}
