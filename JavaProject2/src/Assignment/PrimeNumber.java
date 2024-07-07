package Assignment;
public class PrimeNumber 
{
	static int count;
	public static void main(String[] args) 
	{
			for(int i =2; i<=100; i++)
			{
				for(int j = 2; j<i; j++)
				{ 
					count = 0;
					if(i%j ==0)
					{
						count++;
						break;
					}
				}
					if(count ==0)
					{
						System.out.println("prime no "+ i);
					}
					else
					{
						System.out.println("not prime "+ i);
					}
				}
	}
}
