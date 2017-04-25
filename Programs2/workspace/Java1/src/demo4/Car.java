package demo4;

public class Car extends Machine {

	Machine machi1 = new Machine();

	public int id = 2;

	public void wipeWindShield() {
		System.out.println("Wiping windShields..");
	}

	@Override
	public void start() {
		System.out.println("Car started.");

	}

}
