package CollectionandOther;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class List_Iterator {

	public static void main(String[] args) {
		List a1 = new ArrayList();
		a1.add(12);
		a1.add("13");
		a1.add("Hemant");
		System.out.println(a1);
		
		ListIterator i1 = a1.listIterator();  // hasnext, next, in forward dir
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("*******");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
	}

}
