import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class start10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line:");
		
		String line = input.nextLine();
		
		StringTokenizer t = new StringTokenizer(line);
		while(t.hasMoreTokens()){
			System.out.println(t.nextToken());
		}
		
	}

}
