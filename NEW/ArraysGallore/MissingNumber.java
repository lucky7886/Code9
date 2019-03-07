package ArraysGallore;

public class MissingNumber {

	public static void main(String[] args) {
		
	int[] arr = {1,2,3,4,5,6,7,9};	
		
	missingNumber(arr);
	

	}
	
	static void missingNumber(int[] arr) {
		
	int	sumOfNum = (arr.length+1)*(arr.length+2)/2;
	
	for(int i=0;i<arr.length;i++)
		sumOfNum-=arr[i];
		
		
    System.out.printf("The missing number is %d",sumOfNum);	
	}

}
