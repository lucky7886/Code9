
public class PrimeFactor2 {

	public static void main(String[] args) {
int[] arr = new int[99999999];
		for (int i = 3; i < 9999999; i++) {
			//System.out.printf("Prime factors of %d - ", i);
			int count=0;
			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {
					int val = primeChecker(j);
					if (val == 1) {
						count++;
					//	System.out.printf("%d, ", j);
						}
				}
			}
			arr[i]=count;
			//System.out.println();
		}

	//	for(int i=3;i<10;i++)
	//	System.out.println(arr[i]);
		int w=0,x=0,y=0,z=0;
		for(int i=3;i<9999999;i++) {
			if(arr[i]+arr[i+1]+arr[i+2]+arr[i+3]==16) {
				x=i;
				y=i+1;
				z=i+2;
				w=i+3;
				break;
			}
		}
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(w);
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
