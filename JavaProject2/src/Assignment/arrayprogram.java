package Assignment;

public class arrayprogram {

	public static void main(String[] args) 
	{
		int arr[] = new int[3];
		arr[0] = 61;
		arr[1] = 62;
		arr[2] = 63;
		int givenno= 63;
		
		for(int i = 0; i<arr.length; i++)
		{
			if( givenno == arr[i])
			{
			System.out.println("no is present at" + i);
			}
			else
			{
				System.out.println("not present");
			}
		}
		
	}

}
