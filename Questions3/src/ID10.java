
public class ID10 {

	public static void main(String[] args) {
		int count = 0;
		int counter=1;
		long sum = 2;
		long c = System.currentTimeMillis();
		for (int i = 3; i < 200000; i++) {
			count = 0;
			for (int j = 2; j <= i/2; j++){
				if (i % j == 0) {
					count = -1;
					break;
				}
			}
			if (count == 0) {
				sum += i;
				counter++;
				System.out.println(i);
			}
		}
		long d = System.currentTimeMillis();
		System.out.println();
		System.out.println("Total prime numbers: "+counter);
		System.out.println("Sum of primes " + sum);
		System.out.println("Total time taken "+(d-c)+" ms");
	}

}
