package basicvprogram2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int number1 = s1.nextInt();
		int number2 = s1.nextInt();
		int sum = number1 + number2;
		System.out.println("sum of two number is "+ sum);
		byte a1 = s1.nextByte();
		System.out.println(a1);
		short a2 = s1.nextShort();
		System.out.println(a2);
		long a3 = s1.nextLong();
		System.out.println(a3);
		double a4 = s1.nextDouble();
		System.out.println(a4);
		float a5 = s1.nextFloat();
		System.out.println(a5);
		boolean a6 = s1.nextBoolean();
		System.out.println(a6);
		String a7 = s1.next();  // string
		System.out.println(a7);

	}

}
