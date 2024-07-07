package basicvprogram2;

public class Access_Specifier_within_Package2
{
	public static void main(String[] args) 
	{
		// Access_Specifier_within_Package2 a2 = new Access_Specifier_within_Package2();
		// can we create relation b/w two class within package using extends
		Access_Specifier_within_Package1 a2 = new Access_Specifier_within_Package1();
		a2.add();
		a2.mul();
		a2.div();
	}

}
