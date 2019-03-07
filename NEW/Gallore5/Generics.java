package Gallore5;

import java.util.*;

public class Generics {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		insert(list);
		System.out.println(list);
		
	}

	static void insert(List list) {
		list.add(new String("42"));
		list.add(new Integer(42));
	}

}
