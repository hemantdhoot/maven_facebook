package Assignment;

import java.util.Scanner;

public class primenumber_Scanner 
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a number");
		int no = s1.nextInt();
		for(int i =2; i<no-1; i++)
		{
			if(no%i ==0)
			{
				count++;
			}
		}
			if(count ==0)
			{
				System.out.println("no is prime " +no);
			}
			else
			{
				System.out.println("no is not prime "+ no);
			}
	}
}
