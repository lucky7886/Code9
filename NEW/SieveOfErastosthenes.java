
class Erastosthenes {
	Integer x;
	Integer n;
	boolean[] arr;
	static int count = 0;

	public Erastosthenes(int x, int n) {
		this.n = n;
		this.x = x;
		arr = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			arr[i] = true;
	//	arr[1]=false;
	}

	// calculate prime numbers
	public void findPrimes() {
		arr[0]=false;
		arr[1]=false;
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
		System.out.println("Total " + count);
	}

}

public class SieveOfErastosthenes {

	public static void main(String[] args) {
		long h = System.currentTimeMillis();
		Erastosthenes o = new Erastosthenes(2, 10000000);
		o.findPrimes();
		o.printPrimes();
		long j = System.currentTimeMillis();
		System.out.println("Total time " + (j - h) + " milliseconds");
	}

}
