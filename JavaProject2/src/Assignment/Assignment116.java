package Assignment;
public class Assignment116 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("My name is hemant");
		sb.append(" dhoot");
		System.out.println(sb);
		sb.replace(0, 2, "His");
		System.out.println(sb);
		System.out.println(sb.capacity()); // by default 16 capacity so 16+17 = 33
		System.out.println(sb.length());
		System.out.println(sb.charAt(0));
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(4, 8));
		sb.insert(0, "Hello ");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
