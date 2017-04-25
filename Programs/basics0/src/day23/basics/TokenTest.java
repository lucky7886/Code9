package day23.basics;
import java.util.Scanner;
import java.util.StringTokenizer;
public class TokenTest {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a sentence and press enter");
		
		
		String sentence = scanner.nextLine();
		
		
		String[] tokens = sentence.split(" ");
		System.out.printf("number of elements: %d\nThe tokens are:\n",tokens.length);

		
		for(String token : tokens)
			System.out.println(token);
		
	}

}
