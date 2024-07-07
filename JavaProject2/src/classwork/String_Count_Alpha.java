package classwork;

import java.util.Arrays;

public class String_Count_Alpha 
{
	static int CountofAlpha = 0;
	public static void main(String[] args) 
	{
		String name = "Hemant123";
		char c1[] = name.toCharArray();
		System.out.println(c1);
		System.out.println((Arrays.toString(c1)));
		
		for(int i = 0; i < c1.length; i++)
		{
			boolean answer = Character.isAlphabetic(c1[i]);  // Character is class and we use .isAlphabetic method
			if(answer == true)
			{
				CountofAlpha++;
			}	
		}
			System.out.println(CountofAlpha);
	}
}
