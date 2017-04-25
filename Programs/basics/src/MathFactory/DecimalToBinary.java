package MathFactory;
import java.io.*;
public class DecimalToBinary {

	public static void main(String[] args)throws Exception {

BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int num = Integer.parseInt(m.readLine());
		int digit;
		StringBuffer buffer = new StringBuffer();
		while(num!=0)
		{
			digit=num%2;
			buffer.append(digit);
			num=num/2;
		}
		buffer.reverse();
		System.out.println("Binary representation: "+buffer);
		
		
	}

}
