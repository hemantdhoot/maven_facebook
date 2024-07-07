package basicvprogram2;
	class MethodParent      // assignment 29
	{
		 void add()
		{
			System.out.println("Login using mob no");
		}
	}

public class Method_Overriding extends MethodParent {      // without writing extends keyword we get same output 
	void add()
	{
		System.out.println("login using mail id");
	}

	public static void main(String[] args) {
		Method_Overriding m1 = new Method_Overriding();
		m1.add();
	
	}

}
