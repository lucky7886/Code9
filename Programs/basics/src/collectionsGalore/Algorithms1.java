package collectionsGalore;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;


public class Algorithms1 {

	public static void main(String[] args) {

		Character[] letters = {'P','C','M'};
		
		List<Character> list = Arrays.asList(letters);
		System.out.println("list contains: ");
		output(list);
		
		Collections.reverse(list);
		System.out.println("\nAfter calling reverse, list contains: ");
		output(list);
		
		Character[] lettersCopy = new Character[3];
		List<Character> copyList = Arrays.asList(lettersCopy);
		
		
		Collections.copy(copyList,list);
		System.out.println("\nAfter copying, copyList contains: ");
		output(copyList);
		
		Collections.fill(list,'R');
		System.out.println("\nAfter calling fill, list contains: " );
		output(list);
	}
	private static void output(List<Character> listRef)
	{
		System.out.println("the list is: ");
		for(Character element : listRef)
			System.out.printf("%s ",element);
		System.out.printf("\nMax: %s",Collections.max(listRef));
		System.out.printf("\nMin: %s",Collections.min(listRef));
		
		
	}

}
