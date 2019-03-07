package Gallore3;

public class Exp1 {

	int value;
	String name;

	Exp1(int value, String name) {
		this.name = name;
		this.value = value;
	}

	public static void main(String[] args) {

		Exp1 q1 = new Exp1(12, "start");

		System.out.println(q1);

	}

	public String toString() {
		return "Name is " + name + " value is " + value;
	}

}
