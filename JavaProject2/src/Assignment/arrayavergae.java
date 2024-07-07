package Assignment;

public class arrayavergae {
	static double sum = 0;

	public static void main(String[] args) 
	{
		int a [] = new int[4];
		a[0] = 20;
		a[1] = 5;
		a[2] = 10;
		a[3] = 15;
		
		for(int i = 0; i<4; i++)
		{
			sum = sum+a[i];
		}
		double avg = sum/4;
		System.out.println(avg);
		
		
	}

}
