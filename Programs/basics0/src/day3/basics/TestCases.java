package day3.basics;
import java.util.Random;
public class TestCases {
public static void main(String args[])
{
	Random randomNumbers=new Random();
	int [] frequency=new int[11];
	for(int c=1;c<=1000;c++)
	
		
		++frequency[1+randomNumbers.nextInt(10)];
		System.out.printf("%s%15s\n","TEST_CASES","FREQUENCY");
		for(int b=1;b<frequency.length;b++)
			System.out.printf("%10d%15d\n",b,frequency[b]);
	
	
	

}
}
