package classwork;
public class Continue_Keyword 
{
	public static void main(String[] args) 
	{
		for(int i =0; i<=10; i++)
		{
			if(i == 5) // skip iteration 5
			{
				continue;
			}
			if(i == 6) // skip iteration 6
			{
				continue;
			}
			System.out.println("the number is "+ i);	
		}
	}
}
