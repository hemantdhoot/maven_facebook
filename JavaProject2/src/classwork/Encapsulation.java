package classwork;
class amazon_Login
{
	private String un = "xyz@gmail.com";  // updating the string value
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un = un;
	}
}
public class Encapsulation 
{
	public static void main(String[] args)
	{
		amazon_Login a1 = new amazon_Login();
		a1.setUn("xyz"); 
		System.out.println(a1.getUn());	 // if output is return type than call this way.
	}
}
