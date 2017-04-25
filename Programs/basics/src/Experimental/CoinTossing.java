package Experimental;
import java.util.Scanner;
import java.util.Random;
public class CoinTossing {
static int t=0;
static int h=0;
	private enum Status{HEADS,TAILS};
	private static final Random r1 =  new Random();
	
	public static void main(String[] args) {
Status gameStatus=Status.HEADS;
Scanner s = new Scanner(System.in);
		int x=0;
		do
		{
			
		System.out.println("Do you wanna toss a coin? Press 1 for yes");
			
		x=s.nextInt();	
			if(x==1)
			{
			gameStatus = flip();
			System.out.println(gameStatus);
			}
			else
			{   System.out.printf("Game ended\n");
				System.out.printf("Number of times HEADS came: %d\n",h);
				System.out.printf("Number of times TAILS came: %d\n",t);
				
			}
			}while(x==1);
		
		
	}
     public static Status flip()
	{
		
		int r = r1.nextInt(2);
		if(r==0)
		{ h++;
			return Status.HEADS;
		}
			else{
				t++;
			return Status.TAILS;
			}
		
	}

}
