package classwork;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception_handling2 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		try
		{
			int age = s1.nextInt();
			System.out.println(age);  
		}
		catch (InputMismatchException a2)  // we are entering in console string value so input mismatch exception comes
		{
			System.out.println("exception handling");
		}
	}

}
