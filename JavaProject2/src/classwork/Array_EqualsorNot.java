package classwork;
import java.util.Arrays;
import java.util.Scanner;
public class Array_EqualsorNot 
{
	public static void main(String[] args) 
	{
		System.out.println("enter first array");
		int rollno1[] = new int[3];
		int rollno2[] = new int[3];
		Scanner s1 = new Scanner(System.in);
		for(int i =0; i<=2; i++)
		{
			rollno1[i] = s1.nextInt();
			System.out.println();
		}
		System.out.println("enter second array");
		for(int i =0; i<=2; i++)
		{
			rollno2[i] = s1.nextInt();
			System.out.println();
		}
		System.out.println(Arrays.toString(rollno1));
		System.out.println(Arrays.toString(rollno2));
	if(Arrays.equals(rollno1 , rollno2) == true)
	{
		System.out.println("2 array are same");
	}
	else
	{
		System.out.println("2 arrays are not same");
	}
}
}
