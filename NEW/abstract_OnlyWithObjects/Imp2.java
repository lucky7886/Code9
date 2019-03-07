package abstract_OnlyWithObjects;

public class Imp2 {

	public static void main(String[] args) {

		Abs1 ref = Abs1.getInstance();
		
		ref.doSomething();
		
		ref.doSomething2();
		
		ref.m1();
	}

}
