package Assignment;

public class array1 {

	public static void main(String[] args) 
	{
		int arr1[] = new int[3];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		int arr2[] = new int[3];
		arr2[0] = 1;
		arr2[1] = 5;
		arr2[2] = 3;
		
		for(int i = 0; i< arr1.length; i++)
		{
			if(arr1[i] == arr2[i])
			{
				System.out.println("both array are equal");
			}
			else
			{
				System.out.println("both array are not equal");
			}
		}
		
		

	}

}
