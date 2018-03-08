import java.util.Scanner;

public class arrayNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("enter a number");
			int a = sc.nextInt();
			arr[i] = a;
		}
		for (int val : arr)
			System.out.print(val + " ");
		int l = 0;
		int s = 1000;
		for (int i = 0; i < arr.length; i++){
			if (arr[i]>l)
				l = arr[i];
		}
		for (int i = 0; i < arr.length; i++){
			if (arr[i]<s)
				s = arr[i];
		}
		System.out.print("\nThe largest number is "+l);
		System.out.print("\nThe smallest number is "+s);

	}

}
