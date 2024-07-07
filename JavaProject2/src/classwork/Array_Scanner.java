package classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scanner
{
	public static void main(String[] args)
	{
		int [] rollno = new int[3];  // we can use [] at any place
		Scanner s1 = new Scanner(System.in);
		for(int i = 0; i<rollno.length; i++ )
		{
			System.out.println("please enter the value of rollno " + i);
			rollno [i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));  // converting into string
	}
}
