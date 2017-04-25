package day24.basics;

import java.util.ArrayList;

import java.util.List;

import java.util.Arrays;

import java.util.Collections;


public class Algorithms2 {

	public static void main(String[] args) {

		String[] colors = {"red","white","yellow","blue"};
		
		List<String> list1 = Arrays.asList(colors);
		
		
		ArrayList<String> list2 = new ArrayList();
		
		list2.add("black");
		list2.add("red");
		list2.add("green");
		
		System.out.print("Before addall, list2 contains");
		
		for(String s : list2)
			System.out.printf("%s ",s);
		
		Collections.addAll(list2,colors);
		
		System.out.print("\nAfter addall, list2 contains: ");
		
		for(String s : list2)
			System.out.printf("%s ",s);
		
		
		int frequency = Collections.frequency(list2,"red");
		
		System.out.printf("\nFrequency of red in list2: %d\n",frequency);
		
		boolean disjoint = Collections.disjoint(list1,list2);
		
System.out.printf("list1 and list2 %s elements in common\n",disjoint ? "do not have":"have");
		
		
		
		
		
		
		
		
		
	}

}
