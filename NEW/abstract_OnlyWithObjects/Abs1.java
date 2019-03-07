package abstract_OnlyWithObjects;

public abstract class Abs1 {

	void doSomething() {

		System.out.println("Hello");

	}

	abstract void doSomething2();
	
	abstract void m1();

	static Abs1 getInstance() {
		// return new Abs1();
		// return new Imp1();
		// return new Imp3();
		return new Imp4();
	}

}
