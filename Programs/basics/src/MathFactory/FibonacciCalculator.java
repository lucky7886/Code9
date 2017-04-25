package MathFactory;

public class FibonacciCalculator {

	public static void main(String[] args) {
int c=0;
		while(true)
{
		System.out.println(fibonacchi(c));
c++;
}		
	}
public static long fibonacchi(long x)
{
if(x==0)
	return 0;
if(x<=2)
	return 1;
else 
	return fibonacchi(x-1)+fibonacchi(x-2);


}
}
