package basics;

class Frog {
	private String name;
	private int age;

	public void setName(String newName)

	{
		name = newName;
	}
	public void setAge(int newAge){
		age = newAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class Start3 {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		frog1.setName("Bertie");
		System.out.println(frog1.getName());
	}

}
