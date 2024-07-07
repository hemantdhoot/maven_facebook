package basicprogram;

public class If_Loop_And_Or {		//Assignment 24

	public static void main(String[] args) {
		int a= 10;
		int b = 20;
		
		if (a<20 || a==b)
		{
			System.out.println("1");
		}
		if (a<=10 && b<25)
		{
			System.out.println("2");
		}
		if (!(a<=10 && b>25))
		{
			System.out.println("and not or");
		}

	}

}
