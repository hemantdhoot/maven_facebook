package classwork;
public class Array_Average 
{
	static double average = 0;
	static int sum = 0;
	public static void main(String[] args) 
	{
		int no [] = new int[4];
		no[0] = 10;
		no[1] = 25;
		no[2] = 51;
		no[3] = 75;
		
		for(int i =0; i<no.length; i++)	
		{
			sum = sum + no[i];
			average = sum/no.length;
		}
		System.out.println("average of the array is "+ average);
	}

}
