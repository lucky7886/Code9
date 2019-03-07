package Gallore3;

import java.util.*;

public class Exp6 {

	public static void main(String[] args) {

		int[] a = { 2, 5, 8, 1, 7 };
		Arrays.sort(a);
	//	for (int t : a)
	//		System.out.printf("%d ", t);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(5);list.add(2);list.add(3);list.add(9);list.add(8);
		System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
	}

}
