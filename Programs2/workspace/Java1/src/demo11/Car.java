package demo11;

public class Car extends Machine {

	@Override
	public void start() {
	System.out.println("Starting Car.");
		
	}

	@Override
	public void doStuff() {
	System.out.println("Do stuff in car.");
	}
	public void shutDown() {
		System.out.println("Shutdown car.");
		
	}

}
