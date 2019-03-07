package Gallore4;

public class DecToBin {

	public static void toBinary(int n) {

		int[] binary = new int[1000];
		int i = 0;
		while (n > 0) {

			binary[i++] = n % 2;
			n /= 2;

		}
		for (int x = i - 1; x >= 0; x--) {
			System.out.print(binary[x]);
		}

	}

	public static void main(String[] args) {
		toBinary(8);
	}

}
