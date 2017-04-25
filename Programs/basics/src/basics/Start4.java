package basics;

class Machine {
	private String name;
	 int code;

	public Machine() {
		System.out.println("Constructor running");
		name = "Arnie";
	}

	public Machine(String name) {
		System.out.println("second constructor running");
		this.name = name;
	}

	public Machine(String name, int code) {
		System.out.println("third constructor running");
		this.name = name;
		this.code = code;
	}
}

public class Start4 {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Bertie");
Machine machine3 = new Machine("Chalky", 7);	

machine1.code = 56;
	}
}
