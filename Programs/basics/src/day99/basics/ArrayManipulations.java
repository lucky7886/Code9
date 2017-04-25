package day99.basics;

import java.util.Arrays;
public class ArrayManipulations {

	public static void main(String[] args) {

		double[] doubleArray = {8.4,9.3,0.2,7.9,3.4};
		Arrays.sort(doubleArray);
		System.out.printf("\ndoubleArray: ");
		for(double value : doubleArray)
			System.out.printf("%.1f ",value);
		
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray,7);
		displayArray(filledIntArray,"filledIntArray");
		
		int[] intArray = {1,2,3,4,5,6};
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray,3,intArrayCopy,0,2);
		displayArray(intArray,"intArray");
		displayArray(intArrayCopy,"intArrayCopy");
	
		boolean b = Arrays.equals(intArray,intArrayCopy);
		System.out.printf("\n\nintArray %s intArrayCopy\n",(b ? "==" : "!="));
		
		b = Arrays.equals(intArray,filledIntArray);
		System.out.printf("\n\nintArray %s filledIntArray\n",(b ? "==" : "!="));
		
		int location = Arrays.binarySearch(intArray,5);
		
		if(location >= 0)
			System.out.printf("Found 5 at index %d in intArray\n",location);
	
		else
			System.out.printf("5 not found in intArray");
		
		location = Arrays.binarySearch(intArray,1010);
		if(location >= 0)
			System.out.printf("Found 1010 at index %d in intArray\n",location);
	
		else
			System.out.printf("1010 not found in intArray");
		
	}
	public static void displayArray(int[] array, String description)
	{
		
	System.out.printf("\n%s: ",description);
	for(int value : array)
		System.out.printf("%d ",value);
		
		
	}

}
