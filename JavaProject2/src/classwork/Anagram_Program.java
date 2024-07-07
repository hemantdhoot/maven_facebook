package classwork;

import java.util.Arrays;

public class Anagram_Program
{
	public static void main(String[] args) 
	{
		String input1 = "bread";
		String input2 = "beard";
		char c1[] = input1.toCharArray(); // converting string into new character array
		char c2[] = input2.toCharArray();
		System.out.println(c1);
		System.out.println("before sorting");
		//System.out.println(Arrays.toString(c1));		//use array sorting bcz in string sorting option not avaliable
		//System.out.println(Arrays.toString(c2));	
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		if(Arrays.equals(c1, c2) == true)
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("string is not anagram");
		}
	}

}