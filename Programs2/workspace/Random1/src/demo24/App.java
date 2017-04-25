package demo24;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		int[] arr = new int[7];
		Random r = new Random();
		int c=0;
		int x=0;
		for(int i=0;i<100;i++){
			x = 1+r.nextInt(6);
		++arr[x];
		}
		System.out.printf("%-15s%-20s","NUMBER","FREQUENCY");
		for(int i=1;i<arr.length;i++)
			System.out.printf("\n%-15d%-20d",i,arr[i]);
	}

}
