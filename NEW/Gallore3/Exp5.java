package Gallore3;

public class Exp5 {

	public static void main(String[] args) {

		String a = "";

		int[] hash = new int[128];

		for (int i = 0; i < a.length(); i++) {
			char x = a.charAt(i);
			hash[x]++;
		}
		int count = 0;
		int j = 0;
		for (int i = 0; i < hash.length; i++) {

			if (count < hash[i]) {
				count = hash[i];
				j = i;
			}
		}
		System.out.println("Max occurred character is: " + ((char) j));
		System.out.println("Number of times: " + count);
	}

}
