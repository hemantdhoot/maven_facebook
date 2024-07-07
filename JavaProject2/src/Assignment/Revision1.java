package Assignment;
abstract class addition
{
	abstract void add();
}
	public class Revision1 extends addition
{
	public static void main(String args[])
	{
		
	addition r1 = new Revision1();  /// what is meaning of using additional instead of revision1
	r1.add();
		
	}

	@Override
	void add() {
		System.out.println("1");
		
	}
		
	}