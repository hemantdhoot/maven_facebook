package Assignment;
import java.util.Scanner;
public class Assignment120 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int no = s1.nextInt();
		switch(no)
		{
		case 1: 
			System.out.println("chrome");
			break;
		case 2: 
			System.out.println("safari");
			break;
			
			default:
			System.out.println("internet explorer");
		}
	}
}
