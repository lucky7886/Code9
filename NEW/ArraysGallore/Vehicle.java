package ArraysGallore;

final class X {

}

class Y {
	X x1 = new X();
}

abstract class Vehicle {

	abstract void run();
	abstract void run2();
	void run3(){
		System.out.println("Hello abstraction!!!");
	}

	static public void main(String... args) {
		Car c = new Car();
		c.run3();
	}
	
}

class Car extends Vehicle {

	@Override
	void run() {

	}

	@Override
	void run2() {
				
	}
	

}
