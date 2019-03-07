
 class abc{
	
	
	static int c;
	
	public static final int ccc() {
		c=5;
		return c;
	}
}

public class StaticObject {

	public static void main(String[] args) {
		
		abc p = new abc();
		int i= p.ccc();

	}

}
