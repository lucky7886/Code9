package Gallore4;

public class GcdOfNum {

	public static int gcdNum(int a, int b) {

		if (b == 0)
			return a;
		return gcdNum(b, a % b);

	}

	public static void main(String[] args) {
		System.out.println(gcdNum(98, 56));
	}

}
