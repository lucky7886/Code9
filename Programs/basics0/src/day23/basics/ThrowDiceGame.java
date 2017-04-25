package day23.basics;
import java.util.Random;
import java.util.Scanner;
public class ThrowDiceGame {
public static final int max_val = 6;
	public static final Random R = new Random();
	Scanner input = new Scanner(System.in);
	public void play(){
		
		int n;
		System.out.println("enter the number of dices in the game");
		n=input.nextInt();
		int m=n*max_val;
		int counter=0;
		int c=0;
		while(true){
			counter++;
			 c =  strategy(n,m,counter);
			if(c==m)
			 break;
			
			
			
		}
		System.out.printf("%d:-  Sum of the values on dices is = %d",counter,c);
			System.out.println();
			System.out.println();
	System.out.printf("Number of times dices were rolled until all were 6s is %d",counter);
		
	}
	public int strategy(int x, int y,int z){
		int i=0;
		int sum=0;
		while(i<x){
		
		sum += 1+R.nextInt(6);
		i++;
		}
		
		
		if(sum!=y){
	System.out.printf("%d:-  Sum of the values on dices is = %d",z,sum);
		System.out.println();
        System.out.println();
		}
		
		
		return sum;
		
		
		
		
	}
	
	
}
