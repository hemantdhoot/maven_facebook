package classwork;
	class Parent
	{
		 void add()   // only non static method override
		{
			System.out.println("Parent class method overrding");
			System.out.println("Polymorphis concept");
		}
	}
public class Polymorphism extends Parent
{
	 	void add()
		{
			System.out.println("child class method overrding");
		}
	public static void main(String[] args) 
	{
		Parent p1 = new Parent();
		p1.add();
	}
}