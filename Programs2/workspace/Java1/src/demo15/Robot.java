package demo15;

public class Robot {
private int id;

class Brain{
	
	public void think(){
		System.out.println("Robot "+id+" is thinking.");
	}
	
	
}

static class Battery{
	public void charge(){
		System.out.println("Battery charging.");
	}
}

public Robot(int id){
	this.id=id;
}

public void start(){
	System.out.println("Starting robot "+id);
	Brain brain = new Brain();
	brain.think();
}
}
