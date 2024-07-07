package basicvprogram2;
interface Amazon   // to achive 100% abstraction  
{
	void Login();
}
public class InterfaceEx implements Amazon    // Assignment 32
{
	public static void main(String[] args)
	{
		InterfaceEx i1 = new InterfaceEx();
		i1.Login();
	}

	@Override
	public void Login() 
	{
		System.out.println("override method with same method name");
	}

}
