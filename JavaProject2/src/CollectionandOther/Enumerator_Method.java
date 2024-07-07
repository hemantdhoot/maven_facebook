package CollectionandOther;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerator_Method {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(12);
		v1.add("hkdkl");
		v1.add(4.7);
		System.out.println(v1);
		
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		

	}

}
