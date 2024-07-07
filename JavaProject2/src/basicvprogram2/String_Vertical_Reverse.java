package basicvprogram2;
public class String_Vertical_Reverse 
{
	public static void main(String[] args) 
	{
		String input = "Hemant";
		for(int i = 0; i<input.length(); i++ )  //  or we can write this way ALSO  for(int i = 0; i<6; i++) 
		{
			char Output = input.charAt(i);
			System.out.println(Output);
		}
		System.out.println("_________________");
		for(int i = input.length()-1; i>=0; i--)   // reverse order
		{
			char Output1 = input.charAt(i);
			System.out.println(Output1);
		}
	}
}
