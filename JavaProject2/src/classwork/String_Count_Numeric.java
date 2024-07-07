package classwork;

import java.util.Arrays;

public class String_Count_Numeric
{
	static int Countofnumeric = 0;
	public static void main(String[] args)
	{
		String name = "Hemant12345";
		char c1[] = name.toCharArray();
		System.out.println(c1);
		System.out.println((Arrays.toString(c1)));
		
		for(int i = 0; i < c1.length; i++)
		{
			boolean answer = Character.isDigit(c1[i]);  // .isDigit method used
			if(answer == true)
			{
				Countofnumeric++;
			}	
		}
			System.out.println(Countofnumeric);

	}

}
