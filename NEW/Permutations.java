
public class Permutations {
static int count=0;
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int n = arr.length;
		m1(arr);

	}

	static void m1(int[] arr) {
		
			for (int i=0;i<arr.length;i++) 
				System.out.printf("%d ", arr[i]);
			System.out.println();
			swap(arr,1,2);
			if(count<5) {
				count++;
				m1(arr);
			
			}
		}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
