package basicprogram;

public class CallNonstaticMethod 
{
	void Calling()
	{
	System.out.println("calling non static method");
	}
	 void Calling1()
		{
		System.out.println("calling non static method1");
		}

	public static void main(String[] args) {
		CallNonstaticMethod c1 = new CallNonstaticMethod();
		c1.Calling();
		c1.Calling1();
		System.out.println("calling");

	}

}
