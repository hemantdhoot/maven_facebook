package basicprogram;

public class Constructor_Overloading 
{
	Constructor_Overloading()
	{
		System.out.println("1");
	}
	Constructor_Overloading(int a)
	{
		System.out.println("2");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		new Constructor_Overloading();
		new Constructor_Overloading(5);
		


	}
}
