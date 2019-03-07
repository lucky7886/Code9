import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Erastosthenes2 {
	Integer x;
	Integer n;
	boolean[] arr;
	static int count = 0;
	Set<Integer> p = new TreeSet<Integer>();

	public Erastosthenes2(int x, int n) {
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
		System.out.println("Total " + count);
		return p;
	}

}

public class PrimeSeries {
	static Set<Integer> p = new TreeSet<Integer>();
	static int count = 0;
//	static int count2 = 0;
	static int longestCount = 0;
	static Integer arr[]; 
	public static void main(String[] args) {
		Erastosthenes2 o = new Erastosthenes2(2, 42);
		o.findPrimes();
		p = o.addPrimes();
        arr=new Integer[p.size()];
		int sum = 0;

		for (Integer a : p) {
			sum += a;
		}

		count = p.size();

		// System.out.println(sum);
		Iterator<Integer> itr = ((TreeSet<Integer>) p).descendingIterator();
		Iterator<Integer> itr2 = ((TreeSet<Integer>) p).iterator();
		int count3 = 0;
		System.out.println(p.size());
		for (Integer a : p) {
			arr[count3++] = a;
		}
		/*
		 * while (itr.hasNext()) {
		 * 
		 * int val = primeChecker(sum); if (val == 1) break; sum -= itr.next(); count--;
		 * }
		 */

		count = arr.length;
		int count4=count;
		int j = 0;
		int count2=0;
		initialize(count2);    //initialize the value of sum

		for (int i = arr.length - 1; i >= j; i--) {
			
			
			int val = primeChecker(sum);
			
			if (val == 0) {
				if(longestCount<count4)
					longestCount=count;
				count--;
				count4=count;
				j++;
				sum=initialize(count2++);
				continue;
				
			}
			
			sum -= arr[i];
			count4--;

		}

		// System.out.println(sum);
		System.out.println("New Total " + longestCount);
	}
	
	
	static int initialize(int count) {
		int sum=0;
		for(int i=count;i<arr.length;i++)
			sum+=arr[i];
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
