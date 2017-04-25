package MathFactory;

import java.util.Scanner;

public class StringFinder {

	public static void main(String[] args) {

		Scanner i = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String f = i.nextLine();
		
		System.out.println("Enter a string to search");
		String s = i.nextLine();
		if(f.contains(s))
			System.out.println("string is present");
		else
			System.out.println("Not present");
		
		
		
		
	}

}
