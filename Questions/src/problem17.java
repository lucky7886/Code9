import java.util.Random;
import java.util.Scanner;

public class problem17 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of values in array");
		int in = input.nextInt();
		int[] arr = new int[in];
		for (int i = 0; i < arr.length; i++)
			arr[i] = 1 + r.nextInt(1000);
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
//		System.out.println("number of even numbers "+oddEvenFinder(arr));
//		System.out.println("number of odd numbers "+(arr.length-oddEvenFinder(arr)));
		System.out.println(indexCounter(arr));
		
		
	}

	static int oddEvenFinder(int[] arr) {
		int counter=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2==0)
				counter++;
		return counter;
	}
	
	static int indexCounter(int[] arr){
		int num_odd_left=0;
		int num_odd_right=0;
	
		for(int i=0;i<arr.length;i++)
		{
			int num_even_left=0;
			int num_even_right=0;
			
			for(int k=i;k<arr.length;k++)
			{
				if(arr[k]%2==0)
					num_even_right++;
				
			}
			
			for(int j=0;j<i;j++)
			{
				if(arr[j]%2==0)
					num_even_left++;
			}			
			System.out.println(num_even_right);
			System.out.println(num_even_left);
			
			System.out.println();
			
			if(num_even_right==num_even_left)
			{
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				return i;
			}
		}
		return -1;
	}

}
