
public class FactorialDigitSum {

	public static void main(String[] args) {

		
		
		System.out.println(fact(9));
		
		

	}
	
	static long fact(int n) {
		if(n==1) {
			return 1;
		}
		else
			return n*fact(n-1);
	}

}
