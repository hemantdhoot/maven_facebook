package basicvprogram2;
import java.util.Date;
public class Present_Time 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
		System.out.println(d1);  // current time
		System.out.println(d1.getTime());  // epoch time
		String s1 = d1.toString();	 
		System.out.println(s1);
		System.out.println(s1.length());
		String Date = s1.substring(8,10);
		System.out.println(Date);
		String Month = s1.substring(4,7);
		System.out.println(Month);
		String year = s1.substring(24);
		System.out.println(year);
		System.out.println(Date.concat(" ").concat(Month).concat(" ").concat(year));
		System.out.println(Date.concat("-").concat(Month).concat("-").concat(year));
		System.out.println(Date.concat("/").concat(Month).concat("/").concat(year));
	}

}
