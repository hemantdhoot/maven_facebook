package basicvprogram2;

public class ThisCalling {
	ThisCalling()
	{
		this(5.3);    				// explicit only
		System.out.println("1");
	}
	ThisCalling(int a)
	{
		System.out.println("2");
	}
	ThisCalling(String name)
	{
		this();
		System.out.println("3");
	}
	ThisCalling(double salary)
	{
		this(56);
		System.out.println("4");
	}
	public static void main(String[] args) {
		new ThisCalling("Ramesh");	 // we can create object of any constructor
	}

}
