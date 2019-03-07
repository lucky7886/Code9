package ArraysGallore;

public class ShuffleArray {

	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++)
			arr[i] = i + 1;

		for (int a : arr)
			System.out.printf("%d ", a);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {

			int j = (int) (Math.random() * 5);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int a : arr)
			System.out.printf("%d ", a);
		System.out.println();
	}
}
