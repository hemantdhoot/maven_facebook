package classwork;
class Superclass
{
	
}
public class Upcasting extends Superclass
{
	public static void main(String[] args) 
	{
	Superclass s1 = new Upcasting();  // implicit     child class to super class
	Superclass s2 = (Superclass)new Upcasting(); // explicit   child class to super class
	
	}

}
