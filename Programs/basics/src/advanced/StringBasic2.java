package advanced;

public class StringBasic2 {

	public static void main(String[] args) {

		
		String s = "prateekbhardwajprateekbhardwaj";
		String a = "Bacon ";
		String b = "       monster";
		System.out.println(a.concat(b));
		System.out.println(a.replace('B','F'));
		System.out.println(b.toUpperCase());
		System.out.println(b.trim());
		System.out.println(s.indexOf("ee"));
	}

}
