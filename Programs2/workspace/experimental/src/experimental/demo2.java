package experimental;

public class demo2 {

	public static void main(String[] args) {

		
		String s = new String("Hello");
		String s1 = s.concat("World");
		System.out.println(s);
		System.out.println(s1);
		
		/*StringBuffer b = new StringBuffer("Hello");
		StringBuffer b1 = b.append("World");
		System.out.println(b);
		System.out.println(b1);
if (b==b1){
	System.out.println("yes!!,they are equal");
}		
	
if (s==s1){
	System.out.println("yes!!,they are equal");
}		
*/

System.out.println();
System.out.println();


String s3 = new String("hello");
String s4 = new String("hello");

StringBuffer b3 = new StringBuffer("world");
StringBuffer b4 = new StringBuffer("world");


System.out.println(s3==s4);
System.out.println(s3.equals(s4));

System.out.println(b3==b4);
System.out.println(b3.equals(b4));

String s5 = "MyBad";
String s6 = "MyBad";
System.out.println(s5==s6);

String s7 = new String("MyBad");
String s8 = new String("MyBad");


System.out.println(s6==s7);
System.out.println(s7==s8);
	}
	


}
