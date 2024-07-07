package classwork;

import java.util.Scanner;

public class ScannerEx 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int age1 = s1.nextInt();
		if(age1<=50 && age1>=40)
		{
		System.out.println("Male");
		}
		else if (age1<=39 && age1>=30)
		{
			System.out.println("female");
		}
		else
		{
			System.out.println("custom");
		}
	}

}
