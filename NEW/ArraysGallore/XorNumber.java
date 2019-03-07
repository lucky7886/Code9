package ArraysGallore;

public class XorNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,9};	
		
		missingNumber(arr);
		

		}
		
		static void missingNumber(int[] arr) {
			
		int x1 = 0;
		int x2=0;
		for(int i=1;i<=arr.length+1;i++)
			x1=x1^i;
		
		for(int i=0;i<arr.length;i++)
			x2=x2^arr[i];
			
			
	    System.out.printf("The missing number is %d",x1^x2);	
		}
}
