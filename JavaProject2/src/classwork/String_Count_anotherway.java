package classwork;
public class String_Count_anotherway 
{
	public static void main(String[] args) 
	{
		String name = "Hemant123@#$";
		int Specialcharcount = 0;
		for(int i = 0; i<name.length(); i++)
		{
			char c = name.charAt(i);
			if(!Character.isLetterOrDigit(c))
			{
				Specialcharcount++;
			}
		}
		System.out.println("no of special character count "+ Specialcharcount);
	}

}
