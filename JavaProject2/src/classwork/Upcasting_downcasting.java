package classwork;
class Parentclass
{
	
}
public class Upcasting_downcasting extends Parentclass
{
	public static void main(String[] args) 
	{
		Parentclass p1  = new Upcasting_downcasting(); // upcasting is necessary before doing downcasting
		Upcasting_downcasting u1 = (Upcasting_downcasting) p1; // downcasting need to call explictly
	}

}
