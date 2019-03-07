package Gallore2;

public class arrYay implements SortWow {

	public static void main(String[] args) {

		int[] array = { 3, 9, 6, 18, 15, 12 };

		arrYay a1 = new arrYay();
	//	for (int a : array)
//			System.out.print(a + " ");
//		System.out.println();
		a1.bubbleSort(array);
		for (int a : array)
			System.out.print(a + " ");

	}

	@Override
	public void selectionSort(int[] arr) {
		int maximum = arr[0];
		int index = 0;
		int size = arr.length;
		do {
			for (int i = 0; i < size; i++) {
				if (arr[i] > maximum) {
					maximum = arr[i];
					index = i;
				}
			}
			int temp = arr[index];
			arr[index] = arr[size - 1];
			arr[size - 1] = temp;
			System.out.println(maximum);
			size--;
			maximum = arr[0];
		} while (size > 1);
	}

	@Override
	public void bubbleSort(int[] arr) {

		int size = arr.length - 1;
		do {
			for (int i = 0; i < size; i++)
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}
			size--;

		} while (size >= 1);

	}

	@Override
	public void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		
	}

}
