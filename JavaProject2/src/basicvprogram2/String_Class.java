package basicvprogram2;
public class String_Class   // Assignment 18
{
	public static void main(String[] args) {
		String name = "Hemant";
		System.out.println(name.length());
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf('e'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		String name1 = "Aakash";
		System.out.println(name.concat(" ").concat(name1));  // use for combining string value (concat)
		String name2 = "    Sagar Dhoot  "; 
		System.out.println(name2.trim());        // use for removing extra space from front and last
		//System.out.println(name.contains());
		System.out.println(name.contains(name2));  // use for cross matching and its case sensitive
		System.out.println(name.contains("ant"));
		String name3 = "";
		System.out.println(name3.isEmpty());  // to check string is empty or not
		System.out.println(name.endsWith("t"));
		System.out.println(name.equals(name1));  // to check 2 string are equal or not
	}}
