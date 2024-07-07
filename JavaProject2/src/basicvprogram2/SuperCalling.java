package basicvprogram2;
class Grand_Parent
{
	Grand_Parent()
	{
		System.out.println("Grand Parent class constructor");
	}
}
class Parent3 extends Grand_Parent
{
	Parent3(int a)
	{
		super(); // no need to write super calling here bcz its child class constructor is non para and in non para constructor its by default present
		System.out.println("Parent class constructor"); // super calling 2 type explicit and implicit
	}
}
public class SuperCalling extends Parent3
{
	SuperCalling()
	{
		super(5); // here need to write bcz parent class constructor is para.
		System.out.println("child class constructor");
	}
	public static void main(String[] args) 
	{
	new SuperCalling();
	}
}
