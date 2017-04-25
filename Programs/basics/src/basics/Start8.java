package basics;

import java.util.ArrayList;

class Machine3 {

	@Override
	public String toString() {
		return "I'm a machine";
	}
	public void start(){
		System.out.println("machine starting");
	}

}

class Camera3 extends Machine3 {
	@Override
	public String toString() {
		return "I'm a camera";
	}
	public void snap(){
		System.out.println("picture taken");
	}
}

public class Start8 {

	public static void main(String[] args) {

		ArrayList<Machine3> list = new ArrayList<Machine3>();
		list.add(new Machine3());
		list.add(new Machine3());

		ArrayList<Camera3> list2 = new ArrayList<Camera3>();
		list2.add(new Camera3());
		list2.add(new Camera3());

		showList(list2);
	}

	public static void showList(ArrayList<? extends Machine3> list) {
		for (Machine3 value : list){
			System.out.println(value);
			
		}
	}
			public static void showList1(ArrayList<? super Camera3> list) {
				for (Object value : list){
					System.out.println(value);
//value.snap();
	}
}
}