import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Prime5 {

	public static void main(String[] args) {

		

		// Iterator<Integer> it = l1.iterator();

		long c = System.currentTimeMillis();

		int num = 100;
		int[] array = new int[num];
		for (int i = 2; i <= num; i++)
			array[i] = i;

		System.out.println(array[2]);
		int count = 1;
		int n = 2;
		long sum = 2;
		int x = 0;
		while (true) {

			for(int i=2;i<=num;i+=2)
				array[i] = -1;
	//		sum += l1.get(0);
			count++;
//			n = l1.get(0);
		}

//		System.out.println("Total prime numbers: " + count);
	//	System.out.println("Sum of primes: " + sum);
	//	long d = System.currentTimeMillis();
	//	System.out.println("Total time taken: " + (d - c) + " ms");

	}
}
