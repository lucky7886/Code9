package Gallore4;

public class LcmOfNum {

	public static int gcdNum(int a, int b) {

		if (b == 0)
			return a;
		return gcdNum(b, a % b);

	}

	public static void main(String[] args) {
		System.out.println(gcdNum(8, 6));
		
		System.out.println("LCM is "+ (8*6)/gcdNum(8, 6));
	}

}
