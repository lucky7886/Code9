package review;

import java.util.Scanner;

public class App6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter elements");
		for(int i=0;i<10;i++)
		arr[i] = input.nextInt();	
		sortColors(arr,10);
		for(int i=0;i<10;i++)
			System.out.println(arr[i]+"\t");
		
	}
	
	public static void sortColors(int A[], int n){
		        int zeroPosition = 0;
		        int onePosition = 0;
		        int twoPosition = 0;
		        for(int i = 0; i < A.length; i++){
		            if (A[i] == 0){
		                A[twoPosition] = 2;
		                A[onePosition] = 1;
		                A[zeroPosition] = 0;
		                zeroPosition++;
		                onePosition++;
		                twoPosition++;
		            }
		            else if (A[i] == 1){
		                A[twoPosition] = 2;
		                A[onePosition] = 1;
		                onePosition++;
		                twoPosition++;
		            }
		            else if (A[i] == 2){
		                A[twoPosition] = 2;
		                twoPosition++;
		            }
		        }
	}
	}