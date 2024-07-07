package basicvprogram2;

class Parent11 {
	static void add()
	{
		System.out.println("Parent Class 1");
	}
}
class Parent2 extends Parent11{
	static void sub()
	{
		System.out.println("Parent class 2");
	}
}
public class Multilevel_Inheritance extends Parent2 
{	
	public static void main(String[] args) 
	{
		add();
		sub();
		System.out.println("child class");
	}
}
