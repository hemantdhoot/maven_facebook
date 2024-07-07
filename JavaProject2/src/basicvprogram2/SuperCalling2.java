package basicvprogram2;
class Grand_Parent1
{
	Grand_Parent1()
	{
		System.out.println("Grand Parent class constructor 1");
	}
}
class Parent4 extends Grand_Parent1
{
	Parent4()
	{
		System.out.println("Parent class constructor 1");
	}
}
public class SuperCalling2  // here we not used relation (extends) so wed can call any constructor object 
{
	SuperCalling2()
	{
		System.out.println("child class constructor 1");
	}
	public static void main(String[] args) 
	{
		new Parent4();
	}
}
