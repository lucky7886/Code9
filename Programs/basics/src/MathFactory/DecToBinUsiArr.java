package MathFactory;
import java.io.*;
public class DecToBinUsiArr {

	public static void main(String[] args)throws Exception {
 BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter an number");		
 int x = Integer.parseInt(m.readLine());
		int y=x;
		int n=0;
		int f=0;
		while(y!=0)
		{
		n++;
			y=y/2;
		}
		int[] a = new int[n];
		while(x!=0)
		{
		a[f]=x%2;
		x=x/2;
		f++;
			
	}
		
		int temp=0;
		for(int i=0,j=n-1;i<=a.length;i++)
		
		{
			if(i<j){
			temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
		
		j--;
	}
		
		for(int b : a)
			System.out.print(b);
}
}
