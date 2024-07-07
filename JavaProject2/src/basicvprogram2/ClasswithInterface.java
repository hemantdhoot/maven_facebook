package basicvprogram2;
interface Interface1
{
	void login();
	void logout();
}
interface Interface2 extends Interface1          // using extends keyword interface - interface
{
	void search();
	void payment();
}
public class ClasswithInterface implements Interface2  // using implements keyword child class - interface
{
	void order()
	{
		
	}
	static void summary()
	{
		
	}
	public static void main(String[] args) {
		

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {   // public is showing bcz by default interface method are public but in abstract by default not public
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}

}
