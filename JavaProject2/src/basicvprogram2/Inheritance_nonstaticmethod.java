package basicvprogram2;
class Parent1          // parent class non static method
{  
	void add()
	{
		System.out.println("add");
	}

}

public class Inheritance_nonstaticmethod extends Parent1  // child class non static method
{
	void sub()
	{
		System.out.println("sub");
	}

	public static void main(String[] args) {
		Inheritance_nonstaticmethod c1 = new Inheritance_nonstaticmethod();
		c1.add(); // calling child class method
		c1.sub(); // calling parent class method using same reference variable

	}

}
