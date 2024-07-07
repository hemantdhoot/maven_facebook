package classwork;
public class Array_Class1
{
	public static void main(String[] args) 
	{
		String name[] = new String[3];
		name[0] = "Sagar";
		name[1] = "Hemant";
		name[2] = "Aakansha";
		
		int Rollno[] = new int[3];
		Rollno[0] = 	1;
		Rollno[1] = 	2;
		Rollno[2] = 	3;
		
		char Gender[] = new char[3];
		Gender[0] = 	'M';
		Gender[1] = 	'M';
		Gender[2] = 	'F';
		
		System.out.println("Student name " + "Rollno "+  "gender ");
		
		for(int i =0; i<3; i++)
		{
			System.out.println(name	[i]+"    "+ Rollno[i] +"     "+Gender[i]);
		}
	}
}
