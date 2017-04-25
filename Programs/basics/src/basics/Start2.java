package basics;

class Robot {
	public void speak(String var) {
		System.out.println("Hello: "+var);
	}
public void jump(int height){
	System.out.println("Jumping: "+height);
}

public void move(String direction, int length){
	System.out.println("Moving: "+direction+". metres in direction: "+length);
}
}

public class Start2 {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi I am Sam.");
	sam.jump(8);
	sam.move("East", 50);
	}
}
