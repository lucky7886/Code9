package demo7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {

		
		String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
		
		List<String> list = Arrays.asList(suits);
		System.out.printf("Unsorted Array: %s\n",list);
		
		Collections.sort(list);
		
		System.out.printf("Sorted Array: %s",list);
		
		

	}

}
