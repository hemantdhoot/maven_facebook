package classwork;
public class Exception_Handling1
{
	public static void main(String[] args) 
	{
		try
		{
			int a =1/0;  // exception in try block 
		}
		catch(ArithmeticException a1)  // exception with reference variable
		{ 
			System.out.println("handling exception");
		}
		System.out.println("ram");  // even exception our program run

	}

}
