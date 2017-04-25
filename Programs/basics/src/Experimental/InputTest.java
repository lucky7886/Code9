package Experimental;
import java.io.*;
public class InputTest {

	public static void main(String[] args) throws Exception {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string");		
String a = br.readLine();
System.out.println("enter an integer");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("the output string is: "+a);
		System.out.println("the output integer is: "+b);
		
	}

}
