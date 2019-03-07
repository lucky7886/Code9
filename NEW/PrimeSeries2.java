import java.util.Set;
import java.util.TreeSet;

class Erastosthenes3 {
	Integer x;
	Integer n;
	boolean[] arr;
	static int count = 0;
	Set<Integer> p = new TreeSet<Integer>();

	public Erastosthenes3(int x, int n) {
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

	/*
	 * public void printPrimes() { for (int i = x; i <= n; i++) if (arr[i] == true)
	 * { System.out.println(i); count++; } System.out.println("Total " + count); }
	 */

	public Set<Integer> addPrimes() {
		for (int i = x; i <= n; i++)
			if (arr[i] == true) {
				p.add(i);
				count++;
			}
	//	System.out.println("Total Primes " + count);
		return p;
	}

}

public class PrimeSeries2 {
	static Set<Integer> p = new TreeSet<Integer>();
	static Integer arr[];
	static int y, z;

	public static void main(String[] args) {
		long ab = System.currentTimeMillis();
		
		Erastosthenes3 o = new Erastosthenes3(2, 3944);
	//	Erastosthenes3 o = new Erastosthenes3(2, 50);
		o.findPrimes();
		p = o.addPrimes();
		arr = new Integer[p.size()];
		int a = 0;
		for (Integer b : p)
			arr[a++] = b;

		int count = 0;
		int count2 = p.size();
		int count3 = count2;
		int sum = 0;

		sum = initialize(count);
		int j = 0;
		int longestCount = 0;
		int ans = 0;

		for (int i = arr.length - 1; i >= j; i--) {

			int val = primeChecker(sum);
			if (val == 1) { // reset variables
				if (longestCount < count2) {
					y = count;
					z = count2 + count;
					ans = sum;
					longestCount = count2;
				}
				count3--;
				count2 = count3;
				sum = initialize(++count);
				j++;
				i = p.size();
				continue;
			}
			sum -= arr[i];
			count2--;

		}
		System.out.println("Longest sum " + longestCount);
	//	System.out.println(count);

		for (int i = y; i < z; i++)
			System.out.printf("%d ",arr[i]);
		System.out.printf("\nPrime number is: %d\n ",ans);
		
		long cd = System.currentTimeMillis();
		
		System.out.println("Total time: "+(cd-ab)+" ms");
	}

	static int initialize(int count) {
		int sum = 0;
		for (int i = count; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}

	static int primeChecker(int num) {
		int count = 0;
		if (num == 0)
			return 0;
		if (num == 1)
			return 0;
		if (num == 2)
			return 1;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 0)
			return 1;
		else
			return 0;
	}

}
