package basics;

class Machines{
	
	public void start(){
		System.out.println("Machine started.");
	}
}
	
	class Camera extends Machines{
		public void start(){
			System.out.println("Camera started.");
			}
		public void snap(){
			System.out.println("picture taken.");
		}
	}
	


public class Start7 {

	public static void main(String[] args) {
		Machines machine1 = new Machines();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		Machines machine2 = new Camera();
		//Camera camera2 = new Machine();
		
		Camera camera3 = (Camera)machine2;
		
	camera3.snap();
		Camera camera4 = (Camera)machine1;
		camera4.start();
		machine2.start();
		
		
	}

}
