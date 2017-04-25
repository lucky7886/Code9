package MathFactory;
import java.math.BigInteger;
public class FactorialCalculator2 {

	public static void main(String[] args) {
for(int counter = 0;counter<=5000;counter++)
System.out.printf("%d! = %d\n",counter,factorial(BigInteger.valueOf(counter)));
		
		
	}
	
	public static BigInteger factorial(BigInteger number)
	{
		if(number.compareTo(BigInteger.ONE)<=0)
		return BigInteger.ONE;
		else
	return number.multiply(factorial(number.subtract(BigInteger.ONE)));
		
	}

}
