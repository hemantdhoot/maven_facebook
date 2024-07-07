package basicvprogram2;

import java.util.Date;

public class Epoch_Convert_Human_time {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());    // converting epoch time to human understand
		System.out.println(d2);

	}

}
