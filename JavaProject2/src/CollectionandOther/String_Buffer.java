package CollectionandOther;
public class String_Buffer 
{
	public static void main(String[] args) 
	{
		/* StringBuffer s1 = new StringBuffer("once a time");
		s1.append(" there was a guy");
		s1.insert(5, "upon ");   // inserting a value at index 5
		System.out.println(s1);
		s1.reverse();                // reversing string
		System.out.println(s1); */
		
		/*StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); */ // by default capacity is 16
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("ramsharma");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.replace(1, 5, " Hemant ");   // replacing from index 1 to 5
		System.out.println(sb);
		
		System.out.println(sb.charAt(5));   // char at index
		
		System.out.println(sb.substring(5));  // print from index 5 to end
		
		System.out.println(sb.substring(5,10));  // print from index 5 to 9
		
		sb.setLength(20);
		
		System.out.println(sb.length());
		sb.replace(0, 10, "Hemant "); 
		System.out.println(sb);
		
		sb.delete(2, 5);   // delete from index 2 to 4
		System.out.println(sb);
	}

}
