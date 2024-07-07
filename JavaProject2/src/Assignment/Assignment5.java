package Assignment;

public class Assignment5 {
	Assignment5()
	{
		System.out.println("constructor overloading");
	}
	Assignment5(int a, long b, char c, String s, float d, double e, short r, byte z) 
	
	{
		System.out.println("constructor overloadng with 7 data type");
	}
	public static void main(String[] args) 
	{
		new Assignment5();
		new Assignment5(20, 1234, 'c', "ram", 45.45f, 234.345, (short) 28, (byte) 0); 
		// why we need to define short and byte in front of number 
		//because compiler cant understand which actual constructor invoke so we need type casting

	}

}
