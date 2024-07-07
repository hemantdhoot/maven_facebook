package classwork;
import java.util.Arrays;
public class Array_Copy
{
	public static void main(String[] args) 
	{
		String name [] = new String [4];
		name[0] = "Ram";
		name[1] = "lakshman";
		name[2] = "Sita";
		name[3] = "Bharat";
		String nameCopy[] = new String[name.length];
			for(int i =0; i<name.length; i++)
			{
				nameCopy[i] = name[i];
			}
			
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(nameCopy));
		System.out.println("interchaning index position");
		for(int i =0; i<name.length; i++)
		{
			nameCopy[0] = name[1];   // interchaning index no position
			nameCopy[1] = name[2];
			nameCopy[2] = name[3];
			nameCopy[3] = name[0];
		}
	System.out.println(Arrays.toString(name));
	System.out.println(Arrays.toString(nameCopy));
	}

}
