import java.util.LinkedList;
import java.util.List;

class Erastosthenes8 {
	Integer x;
	Integer n;
	boolean[] arr;
	static int count = 0;
	List<Integer> p = new LinkedList<Integer>();
	
	
	public Erastosthenes8(int x, int n) {
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

	/*public void printPrimes() {
		for (int i = x; i <= n; i++)
			if (arr[i] == true) {
				// System.out.println(i);
				count++;
			}
		System.out.println("Total " + count);
	}*/
	
	public List<Integer> addPrimes() {
		for (int i = x; i <= n; i++)
			if (arr[i] == true) {
				p.add(i);
				count++;
			}
		System.out.println("Total " + count);
		System.out.println();
		return p;
	}

}

public class Truncatable_Primes {

	public static void main(String[] args) {
		Long a= System.currentTimeMillis();
		List<Integer> p = new LinkedList<Integer>();
		Erastosthenes8 o = new Erastosthenes8(10, 800000);
		o.findPrimes();
		p = o.addPrimes();
	//	System.out.println(p.size());
		int sum=0;
		int counter3=0;
		
		
		for(int i=0;i<p.size();i++) {
			int x=0;
			int count1=0;
			int count2=0;
			int c=0;
			int s=1;
			int num = p.get(i);
		//	System.out.println(p.get(i));
			int n=num;
			int size = String.valueOf(num).length();
			while(c!=size-1) {
				c++;
				s=s*10;
				x=n/s;
				if(o.arr[x]==false) {
					count1=1;
					break;
				}
				
			}
			s=1;
			c=0;
			while(c!=size-1) {
				c++;
				s=s*10;
				x=n%s;
				if(o.arr[x]==false) {
					count2=1;
					break;
				}
			}
			
			
			if(count1==0 && count2==0) {
				counter3++;
				System.out.printf("%d) %d\n",counter3,p.get(i));
				sum+=p.get(i);
				}
			if(counter3==11)
				break;
			
			
		}
		
		System.out.println("sum: "+sum);
		Long b= System.currentTimeMillis();
		System.out.println();
		System.out.println("Total time: "+(b-a));
	}

}
