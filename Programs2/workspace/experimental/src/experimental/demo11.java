package experimental;

public class demo11 {

	public static void main(String[] args) {
		
		
		String s = "";
		String s1 = null;
		System.out.println(s);
		System.out.println(s1);
		String s2 = new String();
		System.out.println(s2);
		String s3 = new String("  abcd  ef  g   ");
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(2,5));
		System.out.println(s3.length());
		System.out.println(s3.trim());
		
		
		final StringBuffer sb = new StringBuffer();
	
		//sb.append("software");
		System.out.println(sb);
		//int c = sb.capacity();
	//	System.out.println(c);
		sb.append("abcdefghijklmnopqhj");
	System.out.println(sb.capacity());
	sb.append("qwertyuioplkjhgfdsa");
	System.out.println(sb.capacity());
	sb.append("kjhjfjgfhjbhjvvguigg;ggjkgjkgkjgjgkjgjgkjgkgkjgkgkgjkgkjgjhc");
	System.out.println(sb.capacity());
	StringBuffer s5 = new StringBuffer(10000000);
	System.out.println(s5.capacity());
	
	}

}
