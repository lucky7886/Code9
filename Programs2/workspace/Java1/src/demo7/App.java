package demo7;

class Plant {
	private String name;
public static final int ID = 7;
public String getData(){
	String data = "some stuff"+calculateGet();
	return data;
}

private int calculateGet(){
	return 9;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
