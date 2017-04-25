package experimental;

import java.util.Scanner;

public class demo12 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.println("enter a string");
		String userInput = input.nextLine();
		System.out.println("enter the string that you wanna add to the existing string");
		String newString = input.nextLine();
		System.out.println("Enter the index position at which you wanna add your new string");
		int index = input.nextInt();
		
		System.out.println("After adding the required string at the particular index, the final"
				+ " string is "+modifierOfStrings(userInput, newString, index));
		
	}

	
	public static String modifierOfStrings(String org, String repl, int index){
		
		int iterator;
		
		char[] arr1 = new char[org.length()];
		for(int i=0;i<org.length();i++){
			arr1[i]=org.charAt(i);
		}
		char[] arr2 = new char[org.length()+repl.length()];
		
		for(int i=0;i<index;i++)
			arr2[i]=org.charAt(i);
		iterator=0;
		for(int i=index;i<index+repl.length();i++)
			arr2[i]=repl.charAt(iterator++);
		iterator=index;
		for(int i=index+repl.length();i<org.length()+repl.length();i++){
			arr2[i]=org.charAt(iterator++);
		}
		String result="";
		for(int i=0;i<org.length()+repl.length();i++)
			result+=arr2[i];
		return result;
	}
	
	
}
