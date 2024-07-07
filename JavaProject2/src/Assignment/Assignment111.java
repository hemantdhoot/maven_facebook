package Assignment;
import java.util.ArrayList;
import java.util.Iterator;
public class Assignment111 {
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add(15);
		a1.add(10);
		System.out.println(a1);
		
		Iterator i1 = a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			System.out.println(i1.hasNext());
			System.out.println(i1.equals(a1));
			System.out.println(i1.getClass());
			System.out.println(i1.hashCode());
			System.out.println(i1.toString());
		}
		

	}

}
