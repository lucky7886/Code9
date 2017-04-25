package Puzzles;

import java.util.Scanner;

public class TextGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int x = 1;
		do{
		System.out.println("Enter the text");
		String text = input.nextLine();
		if(text.contains("one")){
			System.out.println("You have won");
		x=0;
		}
			else
			System.out.println("you lose");
	
	
	}while(x!=0);
}
}
