import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) throws MyException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("hello");
		
		System.out.println("enter your age");
		
		int a = input.nextInt();
		
		MyException e = new MyException("You are not allowed");
		
		if(a<21)
			throw e;

	}

}
