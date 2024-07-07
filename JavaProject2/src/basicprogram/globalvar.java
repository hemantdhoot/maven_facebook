package basicprogram;
public class globalvar
{
	static int a; // declare
	static int b = 20;
	static void sum()
	{
	System.out.println(a);
	}
	void sub() 
	{
	a = 10;   // updating global var value and it will be same for all upcoming variable a
	System.out.println(a);
	}
	public static void main(String[] args) 
	{
		a =25; // Initialize
		sum();
		System.out.println("global variable");
		globalvar g1 = new globalvar();
		g1.sub();
	}
}
