package CollectionandOther;

import java.util.ArrayList;

public class Coolection_Program2 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(12);
		a1.add("radha");
		a1.add("kajal");
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		//a1.clear();
		a2 = (ArrayList) a1.clone(); // need to call explicitly
		System.out.println(a2);
		
	}

}