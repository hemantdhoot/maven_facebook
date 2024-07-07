package basicvprogram2;

public class String_SubString {

	public static void main(String[] args) {
		String input = "My name is Hemant";
		System.out.println(input.substring(2));   //substring(end index) get output from starting of index to last
		System.out.println(input.substring(10));
		System.out.println(input.substring(11));
		System.out.println(input.substring(3,17));    // substring(start index, end index) 
		System.out.println(input.length());

	}

}
