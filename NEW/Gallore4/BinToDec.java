package Gallore4;

public class BinToDec {

	public static void toDecimal(int n) {

		int base = 1;
		int decNumber = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			n = n / 10;
			decNumber += lastDigit * base;
			base *= 2;
		}
		System.out.println(decNumber);

	}

	public static void main(String[] args) {

		toDecimal(101101001);

	}

}
