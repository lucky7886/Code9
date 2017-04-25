package experimental;

import java.util.Random;

public class demo19 {
//hhh player number is 100
//	thh player number is 200	
	public static void main(String[] args) {
		String option1="tth";
		String option2="htt";
		int[] arr = new int[100000];
		String outcomes = "";
		int numOfWinsForA=0;
		int numOfWinsForB=0;
		Random r = new Random();
		int tossedCoin;
		for(int i=0;i<100000;i++){
			outcomes="";
		while (!outcomes.contains(option1) && !outcomes.contains(option2)) {
			tossedCoin = r.nextInt(2);
			if (tossedCoin == 0)
				outcomes += "h";
			else if (tossedCoin == 1)
				outcomes += "t";
		}
		if(outcomes.contains(option1))
			arr[i]=100;
		else
			arr[i]=200;
		
		}
		
		for(int i=0;i<100000;i++){
			if(arr[i]==100)
				numOfWinsForA++;
			else
				numOfWinsForB++;
		}
		System.out.printf("\nThe number of times %s player won is %d",option1,numOfWinsForA);
		System.out.printf("\nThe number of times %s player won is %d",option2,numOfWinsForB);
	}
}
