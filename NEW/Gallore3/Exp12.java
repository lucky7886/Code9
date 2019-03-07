package Gallore3;

import java.util.*;

public class Exp12 {

	public static void main(String[] args) {

		List<Integer> iL = new ArrayList<Integer>();
		for (int x = 0; x < 3; x++)
			iL.add(x);
		System.out.println(iL);
		Object[] oa = iL.toArray();
		
		for(Object q:oa)
			System.out.print(" "+(Integer)q);
		
		
		Integer[] ia2 = new Integer[3];
		System.out.println();
		ia2 = iL.toArray(ia2); 
		for(Integer q:ia2)
			System.out.print(" "+q);
		
	}

}
