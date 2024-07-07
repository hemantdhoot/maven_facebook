package basicvprogram2;

import java.util.Date;

public class Future_Time {

	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1);  // present time
		System.out.println(d1.getTime());  
		Date d2 = new Date(d1.getTime()+ 60*60*1000*24*1*5);  // future time
		System.out.println(d2);
		Date d3 = new Date(d1.getTime()- 60*60*1000*24*1*5);  // past time
		System.out.println(d3);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		

	}

}
