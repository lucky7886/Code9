import java.math.BigInteger;

public class FactorialSum2 {

	public static void main(String[] args) {
		
		BigInteger fact = new BigInteger("1");
		for(int i=1;i<=100;i++)
			fact=fact.multiply(BigInteger.valueOf(i));
		
		System.out.println(fact);
		
		String s=fact.toString();
		//System.out.println(s);
		int sum=0;
		for(int i=0;i<s.length();i++)
			sum+=Character.getNumericValue(s.charAt(i));
System.out.println(sum);
	}

}
