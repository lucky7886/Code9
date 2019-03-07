package Gallore2;

enum CoffeeSize {
	BIG(8), SMALL(4), LARGE(16) {
		public String getLid() {
			return "B";
		}
	};

	CoffeeSize(int value) {
		this.value = value;
	}

	private int value;

	public int getValue() {
		return value;
	}

	public String getLid() {
		return "A";
	}
}

class Coffee {

	CoffeeSize size;
}

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee drink1 = new Coffee();
		Coffee drink2 = new Coffee();
		Coffee drink3 = new Coffee();
		drink1.size = CoffeeSize.LARGE;
		drink2.size = CoffeeSize.SMALL;
		drink3.size = CoffeeSize.BIG;
		for (CoffeeSize c : CoffeeSize.values())
			System.out.println(c + " " + c.getValue() + " " + c.getLid());
	}

}
