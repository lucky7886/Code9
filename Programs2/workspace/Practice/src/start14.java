

class singleton{
private static singleton s = new singleton();	
	
	private singleton(){
		
		
	}
	
	public static singleton getSingleton(){
		return s;
	}
	
}

public class start14 {

	public static void main(String[] args) {

		singleton s2 = singleton.getSingleton();
		
		
	}

}
