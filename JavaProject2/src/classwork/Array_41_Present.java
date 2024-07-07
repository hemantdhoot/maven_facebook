package classwork;
public class Array_41_Present 
{
	static int count = 0;
	public static void main(String[] args)
	{
		int age [] = new int [4];
				age[0] = 12;
				age[1] = 41;
				age[2] = 20;
				age[3] = 41;
				int givenNo = 41;
				for(int i = 0; i< age.length; i++)
				{
					if(givenNo == age[i])  			// 41 no is present or not
					{
						System.out.println("no is present in array"+ i );
						count++;  					// counting of 41 no.
					}
					else
					{
						System.out.println("no is not present array"+ i);
					}	
				}
			System.out.println("41 is present "+ count);
	}

}
