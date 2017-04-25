package experimental;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {

		
		
		Scanner st = new Scanner(System.in);
		System.out.println("enter any number");
		int inp = st.nextInt();
		
		int val = singleSum(inp);
		
		
		System.out.println("the sum until single digit is: "+val);
		
		int val2 = singleSumAdv(inp);
		System.out.println();
		System.out.println();
		
		System.out.println("the advanced method: "+val2);
	}

	public static int singleSum(int value){
		
		return value%9;
		
	}
	
	public static int singleSumAdv(int value){
		int sum=0;
		int counter = 0;
		while(value!=0){
			sum+=value%10;
			counter++;
			value=value/10;
		}
		if(sum<10)
		System.out.println("number of digits are: "+counter);
		return sum;
		
	
			
		
		
	}
	
}
