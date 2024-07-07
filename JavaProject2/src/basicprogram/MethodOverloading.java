package basicprogram;

public class MethodOverloading {
	void add() {
		System.out.println("1");
	}
	void add(int a) {
		System.out.println("2");
	}
	static void add(double a) {
		System.out.println("3");
	}

	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.add();
		m1.add(5);
		add(3.14);

	}

}
