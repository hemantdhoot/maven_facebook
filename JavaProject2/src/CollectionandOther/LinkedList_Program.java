package CollectionandOther;

import java.util.LinkedList;

public class LinkedList_Program {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(13);
		l1.add(14);
		l1.add(15);
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);

	}

}
