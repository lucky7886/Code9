package Gallore3;

public class Exp14 {

	public static void main(String[] args) {
		
		
		
		
		String text = "My name is noname";		
		System.out.println(text);
		String text2 = reverseWord(text, 0, 3);
		System.out.println(text2);
		String text3 = reverseWord(text2, 5, 6);
		System.out.println(text3);
		String text4 = reverseWord(text3, 10, 14);
		System.out.println(text4);
		String text5 = reverseWord(text4, 0, 14);
		System.out.println(text5);
	}

	static String reverseWord(String word, int i, int j) {
		Character[] arr = new Character[word.length()];
		int p = 0;
		for (int n = 0; n < word.length(); n++)
			arr[p++] = word.charAt(n);
		int a = i;
		int s = j;

		while (a < s) {
			Character temp = arr[a];
			arr[a] = arr[s];
			arr[s] = temp;
			a++;
			s--;
		}
		String newString = "";
		for (int x = 0; x < word.length(); x++)
			newString += arr[x];
		return newString;
	}

}
