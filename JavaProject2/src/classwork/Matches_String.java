package classwork;
public class Matches_String 
{
	public static void main(String[] args)
	{
		String input = "Hemant";
		System.out.println(input.matches("H(.*)"));  // name start with H
		System.out.println(input.matches("(.*)t"));  // name end with t
		System.out.println(input.matches("......"));  // check string contain 6 letter word
		System.out.println(input.lastIndexOf('t'));   // check index of string
		System.out.println(input.lastIndexOf('n'));
	}

}
