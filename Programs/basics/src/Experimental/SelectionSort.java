package Experimental;
import java.io.*;
import java.util.Random;
public class SelectionSort {

	public static void main(String[] args)throws Exception {

		Random r = new Random();
		BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of the array: ");
		int x = Integer.parseInt(m.readLine());
		int[] arr = new int[x];
		for(int i=0;i<arr.length;i++)
		arr[i] = 1+r.nextInt(900000);
		System.out.println("Elements in the array are: ");
		//for(int c:arr)
			//System.out.printf("%d\n",c);
		System.out.println();
		//int temp=0;
		for(int i=0;i<arr.length-1;i++){
			int minIndex=i;
		for(int j=i+1;j<arr.length;j++){
			if(arr[j]<arr[minIndex])
				minIndex=j;
		}
		int temp=arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;
		}
		
				System.out.println("Sorted array: ");
		for(int v : arr)
			System.out.printf("%d\n",v);
		
	}

}

