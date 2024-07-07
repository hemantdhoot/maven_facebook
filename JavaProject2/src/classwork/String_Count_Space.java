package classwork;
import java.util.Arrays;
public class String_Count_Space
{
	static int CountofSpace = 0;
	public static void main(String[] args) 
	{
		String name = "Hemant Dhoot 12345";
		char c1[] = name.toCharArray();
		System.out.println(c1);
		System.out.println((Arrays.toString(c1)));
		
		for(int i = 0; i < c1.length; i++)
		{
			boolean answer = Character.isSpaceChar(c1[i]);  // .isspacechar method use
			if(answer == true)
			{
				CountofSpace++;
			}	
		}
			System.out.println(CountofSpace);
	}
}
