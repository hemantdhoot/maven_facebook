package CollectionandOther;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(15);
		a1.add(10);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		a1.get(2);
		a1.set(0, "ram"); 
		System.out.println(a1);
		System.out.println(a1.get(2));
		a1.set(0, "ram");   // gives exception of ClassCastException
		System.out.println(a1);
	}

}
