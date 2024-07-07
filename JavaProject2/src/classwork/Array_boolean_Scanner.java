package classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Array_boolean_Scanner {
	public static void main(String[] args)
	{
		boolean [] name = new boolean[3]; 
		Scanner s1 = new Scanner(System.in);
		for(int i = 0; i<name.length; i++ )
		{
			System.out.println("please enter the value of array1 " + i);
			name [i] = s1.nextBoolean();
		}
		boolean [] name1 = new boolean[3]; 
		for(int i = 0; i<name1.length; i++ )
		{
			System.out.println("please enter the value of array2 " + i);
			name1 [i] = s1.nextBoolean();
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name1));
		if(Arrays.equals(name , name1) == true)
		{
			System.out.println("2 array are same");
		}
		else
		{
			System.out.println("2 arrays are not same");
		}
	}

}
