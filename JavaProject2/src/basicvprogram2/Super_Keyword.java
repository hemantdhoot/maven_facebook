package basicvprogram2;
	class MethodParent1   // Assignment 30
	{
	 void add()
	{
		System.out.println("Login using email id");
	}
	}
public class Super_Keyword extends MethodParent1 
{
	void add()
	{
		super.add(); 
		System.out.println("Login using mob no");
		super.add();   // can be used at any line in the non static method and not used in main method bcz main method is staic method
	}
	public static void main(String[] args) {
		Super_Keyword s1= new Super_Keyword();
		s1.add();
	}

}
