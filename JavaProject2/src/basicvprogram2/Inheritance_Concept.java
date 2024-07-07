package basicvprogram2;
class Parent { // parent class
	static void add() 
	{
		System.out.println("addition");     // Assignment 28
	}
}

public class Inheritance_Concept extends Parent // child class inherting property of parent class
{
	static void sub()
	{
	System.out.println("subtration");
	}

	public static void main(String[] args) 
	{
		sub();
		add();

	}

}
