import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Prime3 {

	public static void main(String[] args) {

		List<Integer> l1 = new LinkedList<Integer>();

		// Iterator<Integer> it = l1.iterator();

		long c = System.currentTimeMillis();

		int num=10000;
		for (int i = 2; i < num; i++)
			l1.add(i);
		
		
		 System.out.println(l1.get(0));
		int count = 1;
		int n = 2;
		long sum = 2;

		while (l1.size() > 1) {

			
			for(int i=n;i<=num;i+=n)
				l1.remove(new Integer(i));
			

			System.out.println(l1.get(0));
			sum += l1.get(0);
			count++;
			n = l1.get(0);
		}

		System.out.println("Total prime numbers: " + count);
		System.out.println("Sum of primes: " + sum);
		long d = System.currentTimeMillis();
		System.out.println("Total time taken: " + (d - c)+" ms");

	}
}

