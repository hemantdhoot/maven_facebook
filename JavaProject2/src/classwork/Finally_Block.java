package classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally_Block 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		try
		{
			int age = s1.nextInt();
		}
		catch(InputMismatchException i1)
		{
			System.out.println("handling exception");
		}
		finally   // no matter, always execute this block
		{ 
			System.out.println("thanks for visting, visit again");
		}
	}
}
