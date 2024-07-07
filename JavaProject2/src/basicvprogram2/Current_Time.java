package basicvprogram2;

import java.util.Date;

public class Current_Time 
{
	public static void main(String[] args) 
	{
		
		Date d1 = new Date();
		System.out.println(d1);   // current time
		System.out.println(d1.getTime());  // epoch time
		Date d2 = new Date();
		System.out.println(d2);
	}

}
