package Assignment;

import java.util.ArrayList;

public class Assignment115 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(15);
		a1.add(10);
		System.out.println(a1);
		System.out.println("index zero object is " +a1.get(0));
		a1.set(0, 13);
		System.out.println("replacing object at index zero with 13 " + a1);
	}
}
