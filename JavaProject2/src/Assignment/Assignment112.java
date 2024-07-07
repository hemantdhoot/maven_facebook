package Assignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class Assignment112 
{
	public static void main(String[] args) 
	{
		System.out.println("lets understand property of List");
		List l1= new ArrayList();
		l1.add(12);
		l1.add("12");
		l1.add("Hemant");
		l1.add(null);  // accept multiple null
		l1.add(null); 
		System.out.println(l1);
		Iterator i1 = l1.iterator();  // hasnext, next, in forward dir
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("************");
		System.out.println("lets understand property of set");
		Set s1 = new HashSet();
		s1.add(12);
		s1.add("12");
		s1.add("Hemant");
		s1.add(null);
		s1.add(null);  // only except one null
		System.out.println(s1);
		Iterator i2 = s1.iterator();  // hasnext, next, in forward dir
		while(i2.hasNext())
		{
			System.out.println(i2.next());}	}}
