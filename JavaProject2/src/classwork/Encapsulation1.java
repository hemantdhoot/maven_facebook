package classwork;
class Amazon_Application
{
	private int age = 18;
	private String name = "Hemant";
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
public class Encapsulation1 
{
	public static void main(String[] args) 
	{
		Amazon_Application a1 = new Amazon_Application();
		a1.setAge(21);
		a1.setName("Dhoot");
		System.out.println(a1.getAge());
		System.out.println(a1.getName());

	}

}
