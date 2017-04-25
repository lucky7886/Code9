package basics;
import java.util.Arrays;
import java.util.Random;
public class Testing {

	public static void main(String[] args) {
Random r = new Random();
		int arr[] = new int[100000];
for(int i=0;i<100000;i++)
	arr[i] = 1000+r.nextInt(30000);
		
		Arrays.sort(arr);
		for(int c : arr)
		System.out.printf("%d\n",c);
		
	}

}
