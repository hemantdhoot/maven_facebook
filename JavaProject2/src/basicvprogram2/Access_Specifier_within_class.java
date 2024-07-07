package basicvprogram2;

public class Access_Specifier_within_class {
	public void add()
	{
		System.out.println("1");
	}
	private void sub()
	{
		System.out.println("2");
	}
	protected void mul()
	{
		System.out.println("3");
	}
	void div()
	{
		System.out.println("4");
	}
	public static void main(String[] args) {
		Access_Specifier_within_class a1 = new Access_Specifier_within_class();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}

}
