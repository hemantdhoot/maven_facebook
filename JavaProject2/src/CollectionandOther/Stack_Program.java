package CollectionandOther;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack_Program {

	public static void main(String[] args) {
		System.out.println("lets understand property of stack");
		Stack s1= new Stack();
		//List l1= new ArrayList();
		s1.add(20);    // we can use property of arraylist
		s1.add("12");
		s1.add("Hemant");
		s1.addElement(66);
		
		System.out.println(s1);
		s1.pop();  //  remove last object
		System.out.println(s1);
		s1.peek();   // fetch last element 
		System.out.println(s1.peek());
		s1.push(50);  // replace last object
		System.out.println(s1);
	}

}
