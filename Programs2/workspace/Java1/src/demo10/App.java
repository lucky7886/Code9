package demo10;

public class App {

	public static void main(String[] args) {

		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		Info info1 = new Machine();
		Info info2 = new Person("Name");
		info1.showInfo();
		info2.showInfo();
		outputInfo(mach1);
		outputInfo(new Person("Game"));
	}
	private static void outputInfo(Info info){
		info.showInfo();
	}

}
