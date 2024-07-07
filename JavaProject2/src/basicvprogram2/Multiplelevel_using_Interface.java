package basicvprogram2;

interface one_parent // example of multilple level inheritance
{
	void add();
}

interface Two_parent {
	void sub();
}
public class Multiplelevel_using_Interface implements one_parent, Two_parent // by using extends comma not possible so
																			// using implements
{
	public static void main(String[] args) 
	{
		System.out.println("child");
		Multiplelevel_using_Interface m1 = new Multiplelevel_using_Interface();
		m1.add();
		m1.sub();
	}
	@Override
	public void sub()
	{
		System.out.println("Parent 1");
	}
	@Override
	public void add() 
	{
		System.out.println("Parent 2");
	}

}
