package experimental;

public class demo6 {

	public static void main(String[] args) {

		
		Object o1 = new Object();
		int n1 = o1.hashCode();
		System.out.println(n1);
		
		Object o2 = new Object();
		int n2 = o2.hashCode();
		System.out.println(o1.toString());
		System.out.println(Integer.toHexString(n1));
		String w = Integer.toHexString(n1);
		Integer q = Integer.parseInt(w);
		//System.out.println(o2.toString());
//System.out.println(n2);
		
		
	}

}
