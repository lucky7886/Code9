package Gallore3;

public class EqualsTest {

	public static void main(String[] args) {

		Pencil p1 = new Pencil(3);

		Pencil p2 = new Pencil(3);

		if (p1.equals(p2))
			System.out.println("Both are equal");
		else
			System.out.println("Not Equal");

	}

}

class Pencil {
	private int size;

	Pencil(int size) {
		this.size = size;
	}

	public boolean equals(Object o) {

		if ((o instanceof Pencil) && ((Pencil) o).getSize() == this.getSize())
			return true;
		else
			return false;

	}

	public int getSize() {
		return size;
	}

}
