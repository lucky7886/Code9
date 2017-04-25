package day9.basics;
import java.util.Random;
public class DiceRoll {
private static final Random randomNumbers = new Random();
private static int[] array = new int[13];
public static void main(String[] args) {
	
		
	for(int i =1;i<=36000000;i++)
{
int value=Roll();
++array[value];

}
	System.out.printf("%s%10s\n","INDEX","FREQUENCY");
	for(int i=2;i<array.length;i++)
	System.out.printf("%5d%10d\n",i,array[i]);
	
	}
public static int Roll()
{
	
int die1 = 1 + randomNumbers.nextInt(6);
int die2 = 1 + randomNumbers.nextInt(6);
int sum = die1+die2;
return sum;
}
}
