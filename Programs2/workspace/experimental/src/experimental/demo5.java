package experimental;

import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		long num = s.nextLong();
		System.out.println("enter the number to be searched");
		int search = s.nextInt();
		int count=0;
		int posOfDigitFromRight=0;
		while(num!=0){
			
			long checker = num%10;
			posOfDigitFromRight++;
			num=num/10;
			if(checker==search){
				count++;
			System.out.println("number found on position "+posOfDigitFromRight+" from right");
			}
		}
		System.out.println("toal number count is: "+count);
		
	}

}
