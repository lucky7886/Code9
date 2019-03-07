import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

class Erastosthenes4 {
	Integer x;
	Integer n;
	boolean[] arr;
	static int count = 0;
	Set<BigInteger> p = new TreeSet<BigInteger>();

	public Erastosthenes4(int x, int n) {
		this.n = n;
		this.x = x;
		arr = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			arr[i] = true;
		// arr[1]=false;
	}

	// calculate prime numbers
	public void findPrimes() {
		arr[0] = false;
		arr[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (arr[i] == true)
				for (int j = i * 2; j <= n; j += i)
					arr[j] = false;

		}
	}

	public void printPrimes() {
		for (int i = x; i <= n; i++)
			if (arr[i] == true) {
				// System.out.println(i);
				count++;
			}
	//	System.out.println("Total " + count);
	}

	public Set<BigInteger> addPrimes() {
		for (int i = x; i <= n; i++)
			if (arr[i] == true) {
				p.add(BigInteger.valueOf(i));
				count++;
			}
		// System.out.println("Total Primes " + count);
		return p;
	}

}

public class PandigitalPrime {
	static Set<BigInteger> p = new TreeSet<BigInteger>();

	public static void main(String[] args) {
		long h = System.currentTimeMillis();
		Erastosthenes4 o = new Erastosthenes4(2, 99999999);
		o.findPrimes();
		o.printPrimes();
		p = o.addPrimes();
		System.out.println(p.size());
		int longestCount = 0;
		int value=0;
		for (BigInteger a : p) {
			int counter=0;
			String s = String.valueOf(a);
			for(int i=1;i<=s.length();i++) {
				if(s.contains(String.valueOf(i))) {
					counter++;
				}
				if(counter==s.length()) {
					longestCount=s.length();
					value=a.intValue();
				}
			}
		
		}
		System.out.printf("%d digits\n",longestCount);
		System.out.println(value);
		long j = System.currentTimeMillis();
		System.out.println("Total time " + (j - h) + " milliseconds");
	}

}
