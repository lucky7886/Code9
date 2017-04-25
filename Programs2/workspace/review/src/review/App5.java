package review;

import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {

		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter array values");
		int[] arr = new int[2];
		for(int i=0;i<arr.length;i++){
		arr[i] = input.nextInt();
			if (largest < arr[i]) {
			    thirdLargest = secondLargest;
			    secondLargest = largest;
			    largest = arr[i];
			} else if (secondLargest < arr[i]) {
			    thirdLargest = secondLargest;
			    secondLargest = arr[i];
			} else if (thirdLargest < arr[i]) {
			    thirdLargest = arr[i];
			}
		}
		System.out.println("largest number is:" +largest);
		System.out.println("second largest number is:" +secondLargest);
		System.out.println("third largest number is:" +thirdLargest);
	}

}
