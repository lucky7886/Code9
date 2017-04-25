package demo2;

class Frog{
	private String name;
	private int id;
	public Frog(String name, int id){
		this.name = name;
		this.id = id;
	}
	public String toString(){
	return String.format("id: %d, name: %s",id, name);
		//	return "id: "+id+", name: "+name;
	}
	
}

public class App {

	public static void main(String[] args) {

		Frog frog1 = new Frog("freddy", 7);
		System.out.println(frog1.toString());
		Frog frog2 = new Frog("roger", 5);
		System.out.println(frog2.toString());
		Frog frog3 = new Frog("lucy", 6);
		System.out.println(frog3.toString());
	}

}
