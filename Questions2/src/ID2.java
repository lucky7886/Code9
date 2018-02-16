
public class ID2 {
	static int counter=0;
	static int sum=0;
	public static void main(String[] args) {
		
		evenFibSum(0,1);
		System.out.println("Sum of even numbers of fibonacchi series: "+sum);
		System.out.println(counter);
	}
	
	
	static int fib(int a, int b){
		int c=a+b;
		if(c<100){
		a=b;
		b=c;
		System.out.println(c);
		return(fib(a,b));
		}
		else
		return c;
		
	}
	
	static int evenFibSum(int a, int b){
		int c=a+b;
		if(c<4000000){
		a=b;
		b=c;
		++counter;
		if(counter%2==0){
		System.out.println(c);
		sum+=c;
		}
		return(evenFibSum(a,b));
		}
		else
		return c;
		
	}

}
