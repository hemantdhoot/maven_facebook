package classwork;
public class Assert_Keyword 
{
	static void add(int a, int b)
	{
		assert a == 100; //"precondition"; // if a =100 than its print otherwise gives error bcz its precondition
		int sum = a+b;
		System.out.println(sum);
		System.out.println("assert program");
	}
	public static void main(String[] args)
	{
		add(50,10);
		//String name = ""; // string length greather than 0 than its print its a precondition
		//assert name.length() > 0 : "the length is 0 or less";
		//System.out.println(name);
	}

}
