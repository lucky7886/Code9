package Experimental;
import java.io.*;
import java.util.concurrent.TimeUnit;
public class FactorsRange {
	public static void main(String[] args)throws Exception {
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
int arr[];
		System.out.println("Enter a number");
		int num = Integer.parseInt(m.readLine());
		arr = new int[num+1];
		int c;
		int b=1;
		long t1 = System.currentTimeMillis();
	while(b<=num){
		//System.out.printf("Factors of %d are: ",b);
		int numOfFac = 0;
		for(int i=1;i<=b;i++)
			
			if(b%i==0){
				//System.out.printf("%d, ",i);
				numOfFac++;
			}
		arr[b]=numOfFac;
		//System.out.println();
	
	          b++;
	}
	int lar=0;
	for(int i=1;i<=num;i++)
		if(arr[i]>lar)
			lar=arr[i];
	System.out.printf("The number(s) in the given range having the highest number of factors (%d) is: ",lar);
	for(int i=1;i<=num;i++)
		if(arr[i]==lar)
			System.out.printf(" %d,",i);
	long t2 = System.currentTimeMillis();
	System.out.println("\nTime taken: "+(t2-t1)+" milliseconds");
	
	}

}
