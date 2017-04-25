package review;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String original;
		String reverse="";
		System.out.println("Enter a string to check");
		original = input.nextLine(); 
		int length = original.length();
		for(int i = length-1;i>=0;i--)
			reverse = reverse+original.charAt(i);
		if(reverse.equals(original))
			System.out.println("it's a palindrome");
		
		
	}

}
