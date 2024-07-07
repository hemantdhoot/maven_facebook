package classwork;

public class String_add_sub_remove 
{

	public static void main(String[] args)
	{
		String input = "Hemant123";
		String Output1 = input.replace('1', 'H'); // replacing numeric value
			System.out.println(Output1);	
			String Output2 = input.replace('e', 'H'); // replacing alphabet value
			System.out.println(Output2);	
			String Output3 = input.replaceAll("[a-z]", ""); // replacing all small alphabet value
			System.out.println(Output3);	
			String Output4 = input.replaceAll("[A-Z]", ""); // replacing all capital alphabet value
			System.out.println(Output4);
			String Output5 = input.replaceAll("[0-9]", ""); // replacing all numeric value
			System.out.println(Output5);
	}

}
