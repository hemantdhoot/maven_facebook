package Assignment;
class Superclass
{
	static void add()
	{
		System.out.println("super class");
	}
}
public class Assignment105 extends Superclass
{
	public static void main(String[] args) 
	{
		Superclass converting1	= new Assignment105();
		System.out.println("convert upcasting to downcasting");
		Assignment105 converting2 = (Assignment105) converting1; // downcasting only possible when upcasting done
		System.out.println("convert downcasting to upcasting");
		converting2.add();

	}

}
