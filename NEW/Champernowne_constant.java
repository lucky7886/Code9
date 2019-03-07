
public class Champernowne_constant {

	public static void main(String[] args) {
		
		
		StringBuilder dec = new StringBuilder();
		for(int i=1;i<187000;i++)
			dec.append(String.valueOf(i));
		
		System.out.println(dec.length());
		int prod=1;
		for(int i=0;i<dec.length();i++)
			if(i==0 || i==9 || i==99 || i==999 || i==9999 || i==99999 || i==999999) {
				prod*=Character.getNumericValue(dec.charAt(i));
				System.out.println(Character.getNumericValue(dec.charAt(i)));
			}
		System.out.println(prod);
	}

}
