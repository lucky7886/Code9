package demo9;

class Machine{
	public void start(){
		System.out.println("Machine started.");
	}
}
class Camera extends Machine{
	public void start(){
		System.out.println("Camera started.");
	}
	public void snap(){
		System.out.println("Photo taken.");
	}
}
public class App {

	public static void main(String[] args) {
		
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		
		/////////upcasting///////
		Machine machine2 = new Camera();
		machine2.start();
		
		/////downcasting//////
		Camera camera2 = (Camera)machine2;
		
		camera2.snap();
	
	}

}
