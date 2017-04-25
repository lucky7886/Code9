package basics;

class Machine4{
	public void start(){
		System.out.println("starting machine...");
		
	}
}


public class Start9 {

	public static void main(String[] args) {

		
		Machine4 machine = new Machine4(){
			@Override public void start(){
				System.out.println("camera snapping...");
			}
		};
		machine.start();
		
	}

}
