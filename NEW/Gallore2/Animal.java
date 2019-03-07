package Gallore2;

class Abc4 {

	public final void m1() {
	}

	public void m2() {
	}

}

public class Animal extends Abc4 {
	public void m3() {
	}

	public void m4() {
	}
	public void m2() {
	}

	public static void main(String[] args) {

		Abc4 a1 = new Animal();
		Animal a2 = (Animal)a1;
		
		Abc4 a3 = new Abc4();
		Animal a4 = (Animal)a3;
	
	
	}
	
	

}
