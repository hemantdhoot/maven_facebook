package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment110 
{
	public static void main(String[] args) 
	{
	ArrayList a1 = new ArrayList();
	a1.add(12);
	a1.add(15);
	a1.add(10);
	System.out.println(a1);
	a1.add(0, 11);
	System.out.println(a1);
	ArrayList a2 = new ArrayList();
	a2.add("ram");
	a2.addAll(a1);
	System.out.println(a2);
	a2.addAll(0, a1);
	System.out.println(a2);
	a2.remove(0);
	System.out.println(a2);
	a2.remove("ram");
	System.out.println(a2);
	a2.removeAll(a1);
	System.out.println(a2);
	}
}
