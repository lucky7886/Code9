
class Erastosthenes6 {
	Long x;
	Long n;
	boolean[] arr;
	static int count = 0;

	public Erastosthenes6(long x, long n) {
		this.n = n;
		this.x = x;
		arr = new boolean[(int) (n + 1)];
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
		for (long i = x; i <= n; i++)
			if (arr[(int) i] == true) {
				// System.out.println(i);
				count++;
			}
		System.out.println("Total " + count);
	}

}

public class PrimePattern {

	public static void main(String[] args) {

		Erastosthenes6 o = new Erastosthenes6(2, 150000000);
		o.findPrimes();
	//	o.printPrimes();
		int sum = 0;
		for (int i = 2; i * i < 1000000000; i++) {
			int a = i * i + 1;
			int b = i * i + 3;
			int c = i * i + 7;
			int d = i * i + 9;
			int e = i * i + 13;
			int f = i * i + 27;

			if (o.arr[a] == true && o.arr[b] == true && o.arr[c] == true && o.arr[d] == true && o.arr[e] == true
					&& o.arr[f] == true)
			{
				if (o.arr[a + 1]==false && o.arr[b + 1]==false && o.arr[b + 2]==false && o.arr[b + 3]==false && o.arr[c + 1]==false && o.arr[d + 1]==false
						&& o.arr[d + 2]==false && o.arr[d + 3]==false && o.arr[e + 1]==false && o.arr[e + 2]==false && o.arr[e + 3]==false
						&& o.arr[e + 4]==false && o.arr[e + 5]==false && o.arr[e + 6]==false && o.arr[e + 7]==false && o.arr[e + 8]==false
						&& o.arr[e + 9]==false && o.arr[e + 10]==false && o.arr[e + 11]==false && o.arr[e + 12]==false && o.arr[e + 13]==false) {
					System.out.println(i);
					sum += i;
				}
				
			}
		}
		//System.out.println(sum);
	}

}
