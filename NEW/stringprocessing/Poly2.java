package stringprocessing;

import java.util.Calendar;
import java.util.Date;

public class Poly2 {

	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
		Date time = c.getTime();
		System.out.println(c.getTime());;
	//	System.out.println(c);
		Date d1 = new Date();
	    d1.setTime(d1.getTime() + 3_600_000); 
	    System.out.println(d1);

	}

}
