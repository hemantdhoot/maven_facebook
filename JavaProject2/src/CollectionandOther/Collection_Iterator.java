package CollectionandOther;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Iterator {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(12);
		a1.add("radha");
		a1.add("kajal");
		System.out.println(a1);
		
		Iterator i1 = a1.iterator();  // hasnext, next, in forward dir
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
