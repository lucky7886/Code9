package MathFactory;
import java.io.*;
public class PerfectNumber {

	public static void main(String[] args)throws Exception {
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		int x = Integer.parseInt(m.readLine());
		for(int j=1;j<=x;j++){
		int sum=0;
		for(int i=1;i<j;i++)
			if(j%i==0)
		sum+=i;
		if(sum==j)
			System.out.printf("%d is a PERFECT number\n",j);
		//else
			//System.out.printf("%d is not a perfect number!\n",j);
		}
	}

}
