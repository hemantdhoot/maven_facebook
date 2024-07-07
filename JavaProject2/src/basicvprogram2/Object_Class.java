package basicvprogram2;

public class Object_Class extends Object  // // assignment 19
{   

	public static void main(String[] args)
	{
		
		System.out.println(" every class has intern with Object class");
		Object_Class o1 = new Object_Class();
		
		System.out.println(o1.getClass());  // to get class name
		
		System.out.println(o1.toString());
	}

}