package day24.basics;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import java.util.Arrays;

public class Algorithms1 {

	public static void main(String[] args) {

		
		
		Character[] letters = {'P','C','M'};
		
		
		
		List<Character> list = Arrays.asList(letters);
		
		System.out.println("List Contains: ");
		
		output(list);
		
		Collections.reverse(list);
		
		System.out.println("\nAfter calling reverse, list Contains: ");
		output(list);
		
		
		Character[] lettersCopy = new Character[3];
		
		
		List<Character> copyList  =  Arrays.asList(lettersCopy);
		
		
		
		Collections.copy(copyList,list);
		
		System.out.println("\nAfter calling fill, list contains: ");
		
		output(list);
		
		
		
		
		
	}
	
	private static void output(List<Character> listRef)
	
	{
		
		System.out.printf("The List is: ");
		
		for(Character element : listRef)
			System.out.printf("%s ",element);
		
		
		System.out.printf("\nMax: %s",Collections.max(listRef));
		
		System.out.printf("\nMin: %s",Collections.min(listRef));
		
		
		
		
		
		
	}

}
