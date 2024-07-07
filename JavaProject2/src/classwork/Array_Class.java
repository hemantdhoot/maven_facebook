package classwork;
public class Array_Class 
{
	public static void main(String[] args) 
	{
		int age[] = new int[3];  // declare and initialize of array
		age[0] = 1;
		age[1] = 2;
		age[2] = 3;
		/* System.out.println(age[0]);  // another way to get output
		System.out.println(age[1]);
		System.out.println(age[2]); */
		
		for(int i =0; i<=2; i++)
		{
			System.out.println(age[i]);
		}
	}

}
