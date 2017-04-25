package experimental;

public class demo7 {
int i;
	public demo7(int i){
		this.i=i;
	}
	
	public int hashCode(){
		return i;
	}
	public static void main(String[] args) {

		demo7 d = new demo7(18);
		System.out.println(d.toString());
		
		
		
	}

}
