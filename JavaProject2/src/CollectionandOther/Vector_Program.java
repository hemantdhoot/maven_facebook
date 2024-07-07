package CollectionandOther;

import java.util.Vector;

public class Vector_Program {

	public static void main(String[] args) {
		System.out.println("lets understand property of vector");
		Vector v1= new Vector();
		//List l1= new ArrayList();
		v1.add(12);    // we can use property of arraylist
		v1.add(12);
		v1.add("Hemant");
		v1.addElement(66);
		System.out.println(v1);
		v1.firstElement();
		System.out.println(v1.firstElement());
		v1.lastElement();
		System.out.println(v1.lastElement());
		v1.removeElement(12);
		System.out.println(v1);
		v1.removeAllElements();
		System.out.println(v1);
		v1.capacity();   // size
		System.out.println(v1.capacity()); // gives by default  min size 10
	}

}
;
