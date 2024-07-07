package classwork;
import java.util.Arrays;
public class String_Count_Specialchar
{	
	static int Countofalpha = 0;
	static int Countofnumeric = 0;
	static int Countofspace = 0;
	public static void main(String[] args) 
	{	
		String name = "Hemant 123 @#$^&";
		char c1[] = name.toCharArray();
		System.out.println(c1);
		System.out.println((Arrays.toString(c1)));
		System.out.println(name.length());
	
		for(int i = 0; i < c1.length; i++)
		{	boolean answer = Character.isAlphabetic(c1[i]);  
			boolean answer1 = Character.isDigit(c1[i]);
			boolean answer2 = Character.isSpaceChar(c1[i]);
			if(answer == true)
			{
				Countofalpha++;	
			}	
			if(answer1 == true)
			{
				Countofnumeric++;	}
			if(answer2 == true)
			{
				Countofspace++;	}	
		}
			System.out.println(Countofalpha);
			System.out.println(Countofnumeric);
			System.out.println(Countofspace);
			int Countofspecialchar = name.length()-Countofalpha-Countofnumeric-Countofspace;
			System.out.println("special character is "+ Countofspecialchar);
	}}
