package demo1;


class Thing{
	public final static int LUCKY_NUMBER = 8;
	public String name;
	public static String description;
	public static int count;
	public int id;
	public Thing(){
		id = count;
		count++;
	}
	public void showName(){
		System.out.println("Object id: "+id+", "+description+": "+name);
	}
	
	public static void showInfo(){
		System.out.println(description);
	}
}


public class App {

	public static void main(String[] args) {
		
		Thing.description = "i am a thing";
		
		Thing.showInfo();
		System.out.println("Before creating objects, count is: "+Thing.count);
		//System.out.println(Thing.description);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		thing1.name = "bob";
		thing2.name = "sue";
		System.out.println("After creating objects, count is: "+Thing.count);
		
	//	System.out.println(thing1.name);
		//System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
		
	}

}
