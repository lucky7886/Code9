package review;

import java.util.Random;
import java.util.Scanner;

public class App9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int[] a1 = new int[100];
		for(int i=1;i<=99;i++)
			a1[i]=i;
		int c=10000;
		int y=0;
		while(c!=0){
		int ran = 1+r.nextInt(99);
		c--;
		input.nextLine();
		
		if(a1[ran]!=0)
		System.out.println("The number is: " + ran);
		a1[ran]=0;
		}
		
	}

}
