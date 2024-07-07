package basicprogram;

public class localvariable {    // Assignment 25
	static void sum() {
		int a  = 10; // local variable
		System.out.println(a);
	}
	void sub() {
		int a = 20;
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a = 30;
		System.out.println(a);
		sum();
		
		localvariable l1 = new localvariable();
		l1.sub();
		

	}

}
