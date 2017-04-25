package Experimental;
import java.io.*;
import java.util.Random;
public class QuickSort {
	 static int[] array;
	static int length;

	public static void main(String[] args)throws Exception {
Random r = new Random();
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of the array:");
		int x = Integer.parseInt(m.readLine());
		array = new int[x];
		for(int i=0;i<x;i++)
		array[i] = 1+r.nextInt(10000);
		//for(int c:array)
			//System.out.printf("%d ",c);
		sort();
		System.out.println();
		for(int c:array)
			System.out.printf("%d\n",c);
	}

	
	public static void sort()
	{
		if(array==null || array.length==0)
			return;
		else
		{
			length = array.length;
		  quickSort(0,length-1);
		}
		
	}
	public static void quickSort(int low,int high)
	{
		int i= low;
		int j = high;
		
		int pivot = array[low+(high-low)/2];
		while(i<=j)
		{
			while(array[i]<pivot)
				i++;
			while(array[j]>pivot)
				j--;
			if(i<=j){
				exchange(i,j);
			i++;
			j--;
			}

			   if (low < j)
		            quickSort(low, j);
		        if (i < high)
		           quickSort(i, high);
		    }
		}
		
		
		
		
	
	public static void exchange(int n,int m)
	{
		
		int temp = array[n];
		array[n] = array[m];
		array[m] = temp;
		
		
	}
}
