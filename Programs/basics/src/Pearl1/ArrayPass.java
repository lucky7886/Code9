package Pearl1;

public class ArrayPass {

	
	public static void main(String[] args) {

		int[] arr1 = {1,4,7,9};
		
		int y = pass(arr1);
		System.out.printf("the sum of the elements in the array is: %d",y);
	}
	
	public static int pass(int arr[])
	{
		int sum=0;
		for(int x:arr)
		sum+=x;
		return sum;
		
		
	}

}
