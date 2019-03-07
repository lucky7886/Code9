
public class PrimeCalculator {
	static int count = 0;
	static int sum = 0;

	public static void main(String[] args) {
		int n = 3944;
		long h = System.currentTimeMillis();
		for (int i = 7; i < n; i++) {

			primeCalc(i);

		}
		long j = System.currentTimeMillis();
		System.out.println(count);
		System.out.println(sum);
		System.out.println("Total time " + (j - h) + " milliseconds");

	}

	public static void primeCalc(int n) {

		int flag = 0;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				flag = 1;
		if (flag == 0) {
			System.out.println(n);
             sum+=n;
			count++;
		}
	}

}
