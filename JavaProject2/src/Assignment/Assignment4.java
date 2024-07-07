package Assignment;

public class Assignment4 
{
	void Calling()
	{
	System.out.println("calling non static method");
	}
	static void Calling1()
	{
	System.out.println("calling static method");
	}

	public static void main(String[] args)
	{
		Calling1();
		Assignment4 a1 = new Assignment4();
		a1.Calling();
		
	}

}
