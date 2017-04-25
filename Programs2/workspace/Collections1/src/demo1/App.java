package demo1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		
	ArrayList<Integer> numbers = new ArrayList<Integer>();	
		
		numbers.add(10);
		numbers.add(50);
		numbers.add(500);
		
		System.out.println(numbers.get(0));
		System.out.println("\nIteration #1: ");
		for(int i=0;i<numbers.size();i++){
			System.out.println(numbers.get(i));
		}
		
		numbers.remove(numbers.size()-1);
		numbers.remove(0);
		
		System.out.println("\nIteration #2: ");
		for(Integer value : numbers){
			System.out.println(value);
		}
		
	}

}
