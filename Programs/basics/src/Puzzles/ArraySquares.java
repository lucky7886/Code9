package Puzzles;
import java.util.Scanner;
public class ArraySquares {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of elements in the Array");

		int x=input.nextInt();

		
		int[] a = new int[x];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<a.length;i++)
			a[i]=input.nextInt();
		System.out.println("enter the range:");
		System.out.println("enter the first number of the range:");
		int q = input.nextInt();
		System.out.println("enter the second number of the range:");
		int w= input.nextInt();
		int sum=0;
		for(int o : a)
			System.out.printf("%d ",o);
		for(int i=q;i<=w;i++)
		sum+=a[i]*a[i];
		System.out.printf("the sum of squares of the desired range is: %d",sum);
		
	}

}
