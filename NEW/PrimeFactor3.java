
public class PrimeFactor3 {
	static int n = 999999;
	static boolean[] arr2 = new boolean[n];
	static int[] arr = new int[999999];
	public static void main(String[] args) {

		for (int i = 0; i < n; i++)
			arr2[i] = true;
		arr2[0] = false;
		arr2[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (arr2[i] == true)
				for (int j = i * 2; j < n; j += i)
					arr2[j] = false;

		}
		System.out.println("hello");

		int c=0;
		for (int i = 3; i < 999999; i++) {
		//	System.out.println(i);
			// System.out.printf("Prime factors of %d - ", i);
			int count = 0;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					int val = primeChecker(j);
					if (val == 1) {
						count++;
						// System.out.printf("%d, ", j);
					}
				}
			}
			arr[i] = count;
			if((i+2)%4==0) {
		    c=arrayChecker(i-3);
			}
			if(c==1)
				break;
		//	System.out.println(arr[i]);
			// System.out.println();
		}

		// for(int i=3;i<10;i++)
		// System.out.println(arr[i]);
		
	}
	
	static int arrayChecker(int i) {
		int w = 0, x = 0, y = 0, z = 0;
			if (arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] == 16) {
				x = i;
				y = i + 1;
				z = i + 2;
				w = i + 3;
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
				System.out.println(w);
				return 1;
			}
		
		return 0;
	}

	static int primeChecker(int num) {
		if (arr2[num] == true)
			return 1;
		else
			return 0;
	}
}
