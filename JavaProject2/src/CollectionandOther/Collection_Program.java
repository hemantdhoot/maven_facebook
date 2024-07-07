package CollectionandOther;

import java.util.ArrayList;

public class Collection_Program {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(12);
		a1.add("12");
		a1.add("Hemant");
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		System.out.println(a2);
		a2.add(3, "Dhoot");
		System.out.println(a2);
		a2.addAll(0, a1);
		System.out.println(a2);
		a2.removeAll(a2);
		System.out.println(a2);
		a1.size();
		System.out.println(a1.size());
		a1.contains(12);
		System.out.println(a1.contains(12));
		a1.add("ramshyam");
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		boolean answer = a1.isEmpty();
		System.out.println(answer);

		
	}

}
