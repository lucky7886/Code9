import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prime {

	public static void main(String[] args) {
	
		List<Integer> l1 = new ArrayList<Integer>();
		
		Iterator<Integer> it = l1.iterator();
		
		long c = System.currentTimeMillis();
		
		for(int i=2;i<100;i++)
			l1.add(i);
	//	System.out.println(l1.get(0));
		int count=1;
		int n=2;
		int sum=2;
	
		
		
		while(l1.size()>1){
		List<Integer> l2 = new ArrayList<Integer>();
		for(int a:l1)
			if(a%n==0)
				l2.add(a);
		l1.removeAll(l2);		
	//	System.out.println(l1.get(0));
		sum+=l1.get(0);
		count++;
		n=l1.get(0);
	}
		
		System.out.println("Total prime numbers: "+count);
		System.out.println("Sum of primes: "+sum);
		long d = System.currentTimeMillis();
		System.out.println("Total time taken: "+(d-c));
	}

}
