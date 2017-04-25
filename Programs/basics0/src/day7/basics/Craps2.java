package day7.basics;
import java.util.Random;
public class Craps2 {
private static final Random randomNumbers = new Random();
private enum STATUS{WON,LOST,CONTINUE};
private static final int ELEVEN = 11;
private static final int SEVEN = 7;
private static final int TWO = 2;
private static final int THREE = 3;
private static final int TWELVE = 12;
static int[] arrayWin=new int[22];
static int[] arrayLost=new int[22];
	public static void main(String[] args) {
		
		 int myPoint = 0;
			STATUS gameStatus;
		for(int i=1;i<=1000000;i++)
		{
			int c=1;
			int d=1;
			int e=1;
			
			int sumOfDie = RollDie();
		
		
			switch(sumOfDie)
			{
			case SEVEN:
			case ELEVEN:
				gameStatus=STATUS.WON;
				++arrayWin[c];
				break;
			case TWO:
			case THREE:
			case TWELVE:
			gameStatus=STATUS.LOST;
			++arrayLost[d];
			break;
			default:
				gameStatus=STATUS.CONTINUE;
				myPoint=sumOfDie;
				break;
				
		     }
		
		 while(gameStatus==STATUS.CONTINUE)
		 {
			 e++;
			 sumOfDie=RollDie();
			if(sumOfDie==myPoint)
			{
				gameStatus=STATUS.WON;
				if(e<=20)
			++arrayWin[e];
				else
					++arrayWin[21];
			}
			if(sumOfDie==SEVEN)
			{
				gameStatus=STATUS.LOST;
				if(e<=20)
			++arrayLost[e];
				else
					++arrayLost[21];
			}
		}
		 
		
		}
		System.out.printf("%s%15s\n","INDEX","WIN_FREQUENCY");
		for(int i=1;i<=21;i++)
			System.out.printf("%5d%15d\n",i,arrayWin[i]);
		System.out.printf("%s%15s\n","INDEX","LOST_FREQUENCY");
		for(int i=1;i<=21;i++)
			System.out.printf("%5d%15d\n",i,arrayLost[i]);
	}
public static int RollDie()
{
int die1=1+randomNumbers.nextInt(6);
int die2=1+randomNumbers.nextInt(6);
return die1+die2;

}
}
