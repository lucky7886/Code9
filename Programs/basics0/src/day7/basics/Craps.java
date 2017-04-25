package day7.basics;
import java.util.Random;
public class Craps {
	private static final Random randomNumbers = new Random();
	private enum STATUS {WON,LOST,CONTINUE};
	private static final int ELEVEN = 11;
	private static final int SEVEN = 7;
	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int TWELVE = 12;
	public static void main(String[] args) {
    int myPoint = 0;
		STATUS gameStatus;
	
			int sumOfDie = RollDie();
	
		switch(sumOfDie)
		{
		case SEVEN:
		case ELEVEN:
			gameStatus=STATUS.WON;
			break;
		case TWO:
		case THREE:
		case TWELVE:
		gameStatus=STATUS.LOST;
		break;
		default:
			gameStatus=STATUS.CONTINUE;
			myPoint=sumOfDie;
			System.out.printf("your point is: %d\n",myPoint);
			break;
			
	     }
	
	 while(gameStatus==STATUS.CONTINUE)
	 {
		 sumOfDie=RollDie();
		if(sumOfDie==myPoint)
			gameStatus=STATUS.WON;
		if(sumOfDie==SEVEN)
			gameStatus=STATUS.LOST;
		
	}
	
	
	 if(gameStatus==STATUS.WON)
		 System.out.println("YOU HAVE WON!!");
	 else
		 System.out.println("YOU HAVE LOST!");
	}

	
	
	
	public static int RollDie()
{
	int die1 = 1+randomNumbers.nextInt(6);
	int die2 = 1+randomNumbers.nextInt(6);
	int sum = die1+die2;
	System.out.printf("values of die1 and die2 are %d and %d\n",die1,die2);
	System.out.printf("sum is %d\n",sum);
    return sum; 	
}
}
