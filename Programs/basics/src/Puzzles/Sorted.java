package Puzzles;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Sorted {

	
	public static void main(String[] args) {

		 Random r = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = input.nextInt();
		
        int[] array = new int[size];
		
		for(int count = 0; count<array.length;count++)
		{
			
			array[count] = 1+r.nextInt(1000);
			
		}
		

	/*		
		bubbleSort(array);
		System.out.println("\n\n\n");
		selectionSort(array);
		System.out.println("\n\n\n");
	*/
		//insertionSort(array);
		collectionsUse(array);
	}
	public static void collectionsUse(int[] d1)
	{
		
		List<Integer> lists = new ArrayList<Integer>();
		
		//lists = Arrays.asList(d1);
		for(int value : d1)
			lists.add(value);
		int a = (int)System.currentTimeMillis();
		Collections.sort(lists);
		int b = (int)System.currentTimeMillis();
		System.out.printf("\nTime taken for sorting using Collections is: %d\n",b-a);
		//System.out.println("After sorting: ");
		//for(int value : lists)
        //System.out.printf("%d ",value);		
		
		
		
	}
	public static void insertionSort(int[] c1)
	{

/*
		System.out.println("Before Sorting:\n ");
		for(int element : c1)
			System.out.printf("%d ",element);
		System.out.println();
	*/	
		int a = (int)System.currentTimeMillis();

		int insert;
		
		for(int next = 1; next<c1.length; next++)
		{
			insert = c1[next];
			
			int moveItem = next;
			
			while(moveItem>0 && c1[moveItem - 1] > insert)
			{
			c1[moveItem] = c1[moveItem - 1];
			moveItem--;
				
			}
			c1[moveItem] = insert;
		}
			int b = (int)System.currentTimeMillis();
			System.out.printf("\nTime taken for sorting using Insertion sort is: %d\n",b-a);
			
			//System.out.println("\nAfter Sorting\n");
			//for(int element : c1)
			//	System.out.printf("%d ",element);
			System.out.printf("\n\n\n\n");
			
		
		
		}

	
	public static void bubbleSort(int[] a1)
	{
	/*
		System.out.println("Before Sorting:\n ");
		for(int element : a1)
			System.out.printf("%d ",element);
		System.out.println();
	*/
	int a = (int)System.currentTimeMillis();	
		int temp=0;
	for(int i=0;i<a1.length;i++){
		for(int j=1;j<a1.length-i;j++)
			if(a1[j-1]>a1[j]){
				
				temp = a1[j-1];
	            a1[j-1] = a1[j];
	            a1[j] = temp;
	}
	}
	int b = (int)System.currentTimeMillis();
	System.out.printf("\nTime taken for sorting using Bubble sort is: %d\n",b-a);
	/*
	System.out.println("\nAfter Sorting\n");
	for(int element : a1)
		System.out.printf("%d ",element);
	*/
	}
	
	public static void selectionSort(int[] b1)
	{
		/*
		System.out.println("Before Sorting:\n ");
		for(int element : b1)
			System.out.printf("%d ",element);
		System.out.println();
		*/
		int a = (int)System.currentTimeMillis();
		int smallest;
		int temp;
		for(int i=0; i<b1.length; i++){
			smallest = i;
		for(int j = i+1; j<b1.length; j++){
			if(b1[j]<b1[smallest])
				smallest = j;
		}
		temp = b1[smallest];
		b1[smallest] = b1[i];
		b1[i] = temp;
		
		}
		int b = (int)System.currentTimeMillis();
		System.out.printf("\nTime taken for sorting using Selection sort is: %d\n",b-a);
		/*
		System.out.println("\nAfter Sorting\n");
		for(int element : b1)
			System.out.printf("%d ",element);
		*/
		
		
	}
	
	
}
