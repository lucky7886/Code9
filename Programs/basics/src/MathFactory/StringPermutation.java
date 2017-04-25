package MathFactory;

import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a string");
String s = input.nextLine(); 
	//	String s = new String("prateek bhardwaj");
	for(int i=0;i<s.length();i++)
	{
	
		String u = s.substring(i,s.length());
	
		System.out.println(u);
	}
   //  String k = "";
     int sum=0;
	//char a = ' ';
	//System.out.println((int)a);
	
	for(int i=0;i<s.length();i++){
		char c = s.charAt(i);
		if(c!=' ')
		sum+=(int)c-96;
	//	k+=c;
		
		}
	System.out.printf("The sum of characters is: %d",sum);
	System.out.printf("\nThe sum of characters to one digit: %d",sum%9);
	
	}

}
