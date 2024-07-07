package classwork;

public class Palindrome_Program 
{
	public static void main(String[] args)
	{
		String input = "madam";
		String Reverse = "";
		for(int i =input.length()-1; i>=0; i--)
		{
			char output = input.charAt(i);
			Reverse = Reverse + output;
		}
		System.out.println(Reverse);
		if(input.equals(Reverse))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not a palindrome");
		}
	}
}
