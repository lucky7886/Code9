package demo15;

import java.util.Scanner;

public class App {
	
public static void main(String[] args){
Scanner input = new Scanner(System.in);
	int max = 0;
//	int[] arrayValues = {2, 39, 41, 27, 36, 42, 35, 49, 52, 63, 27, 2, 1, 1, 41,12,12,12,12,41,36,38,35,36,27};
	
	System.out.println("Enter the number of elements: ");
	int n = input.nextInt();
	int[] arrayValues = new int[n+1];
	System.out.println("Enter the elements: ");
	for(int i=0;i<n;i++)
		arrayValues[i] = input.nextInt();
	/*	int j = 0;
		int k =0;
		while(j!=-1){
			arrayValues[k] = input.nextInt();
			if(arrayValues[k] ==-1)
				j=-1;
			k++;
		}
	*/
	for(int i=0;i<arrayValues.length-1;i++){
		
		if(arrayValues[i]>max)
			max = arrayValues[i];
	
		
	}
	int[] arr = new int[max+1];
	
	for(int i=0; i<arrayValues.length;i++)
	++arr[arrayValues[i]];
	
	System.out.printf("%6s%20s\n","NUMBER","FREQUENCY");
	
	for(int i=1;i<arr.length;i++)
		if(arr[i]!=0)
		System.out.printf("%-6d%12d\n",i,arr[i]);
	
}
}
