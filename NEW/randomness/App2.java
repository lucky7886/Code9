package randomness;

public class App2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			m1(5);
	}

	public static void m1(int n) {
		if (n < 1)
			return;
		else {
			System.out.println(n);
			m1(n - 1);
			System.out.println(n);

		}
	}

}
