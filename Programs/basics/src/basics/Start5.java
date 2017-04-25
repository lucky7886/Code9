package basics;

class Thing {
	public String name;
	public static String description;

public void showName(){
	System.out.println(name);
}
public static void showInfo(){
	System.out.println("Hello");
}

}

public class Start5 {

	public static void main(String[] args) {

		Thing.description = "I am a thing.";
		Thing.showInfo();
		System.out.println(Thing.description);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
	
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		thing1.showName();
		System.out.println(thing1.name);
		System.out.println(thing2.name);
	}

}
