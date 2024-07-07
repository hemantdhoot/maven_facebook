package basicprogram;

public class CallStaticMethod 
{
	public static void main(String[] args) {
		Calling();
		System.out.println("main method");
		Calling();
		Calling();
		Calling1();

	}
	static void Calling()
	{
	System.out.println("calling static method");
	}
	static void Calling1()
	{
	System.out.println("calling static method1");
	}

}
