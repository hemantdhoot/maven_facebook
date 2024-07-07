package basicprogram;

public class globalvariable {
	static String name = "sita"; 
	String name1 = "sita"; 
	int age = 19;
	double weight = 90.87;
	
	void add (String name, int age, double weight)
	{
		System.out.println("hey my biodata is  " + name  + age  +  weight);
	}
public static void main(String[] args) {
	globalvariable g1= new globalvariable();
	System.out.println(name);
	System.out.println(g1.name1);
	System.out.println(g1.age);
	System.out.println(g1.weight);
	g1.add("ram",51, 89.90);
	}

}
