package stringprocessing;

import java.util.Date;
import java.util.*;

public class Poly1 {

	public static void main(String[] args) {
		List<Date> list = new ArrayList<Date>();
		for (int i = 0; i < 1000000; i++) {
			list.add(new Date());
		}

		System.out.println( list.get(0).compareTo(list.get(99999)));

	}

}
