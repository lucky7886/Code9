package demo10;

public class Machine implements Info {
	
	private int id = 7;
public void start(){
	System.out.println("Machine started.");
}
@Override
public void showInfo() {
	
	System.out.println("Machine Id is: "+id);
	
}
}
