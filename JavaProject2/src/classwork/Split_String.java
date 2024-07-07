package classwork;

import java.util.Arrays;

public class Split_String 
{
	public static void main(String[] args) 
	{
		String a1 = "My dream job to become Automation Engineer";
		String arr[] = (a1.split(" "));	 // split the string where space present
		System.out.println(Arrays.toString(arr));
		System.out.println("split string");

	}

 }
