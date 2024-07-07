package basicvprogram2;

public class ThisKeyword 
{
	int age;
	String name;
	double salary;
	void add(int age, String name, double salary) // condition (global variable is same as method parameter)
	{
		this.age = age;
		this.name = name;
		this.salary= salary;
	}
	public static void main(String[] args) 
	{
		ThisKeyword t1 = new ThisKeyword();
		t1.add(5, "ram", 5.3456); // updating global variable value to local variable value  
		System.out.println(t1.age);  // calling global variable
		System.out.println(t1.name); 
		System.out.println(t1.salary);
	}

}
