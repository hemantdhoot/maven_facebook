package basicprogram;
public class Program1 {
	static void add() {
		int a = 1;
		int b = 2;
		int sum = a+b;
		System.out.println(sum);}
	static void sub() {
		int a = 1;
		int b = 2;
		int sub = a-b;
		System.out.println(sub);}
	static void mul() {
		int a = 1;
		int b = 2;
		int multiply = a*b;
		System.out.println(multiply);}
	static void div() {
		int a = 10;
		int b = 2;
		int division = a/b;
		System.out.println(division);}
	static void mod() {
		int a = 10;
		int b = 2;
		int Modu = a%b;
		System.out.println(Modu);
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}

}
