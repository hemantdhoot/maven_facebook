package basicprogram;

public class Finalariable {
	final static int a =10;
	 final void add() 
	{
		// a=25; // global var is final so we cannot update value through out the program
		System.out.println(a);
	}
	final static void sub()
	{
		final int a = 30;  // local variable is final than we cannot update value within the method
		System.out.println(a);
	}
	public static void main(String[] args) {
		int a = 20;
		System.out.println(a);
		sub();
		Finalariable f1 = new Finalariable();
		f1.add();
	}
}
