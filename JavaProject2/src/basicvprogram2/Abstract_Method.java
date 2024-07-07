package basicvprogram2;
	abstract class Two      // assignment 31
	{
		abstract void add();
	}
public class Abstract_Method extends Two
{
	public static void main(String[] args) 
	{
		Abstract_Method a1 = new Abstract_Method();
		a1.add();
	}
	@Override
	 void add() 
	{
		System.out.println("chid class method with same name and sig but different implementation");
	}
}
