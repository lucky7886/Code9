package MathFactory;
import java.io.*;
public class PrimeChecker {

	public static void main(String[] args) throws Exception {
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
       double num = Double.parseDouble(m.readLine());
       int c=0;
       for(int i=1;i<num;i++)
       {
    	   if(num%i==0)
    		   c++;
    	   if(c==2)
    		   break;
       }
    	   if(c==1)
    	   System.out.println("The number is prime");
       else
    	   System.out.println("The number is not prime");
	}

}
