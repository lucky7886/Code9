package experimental;

import java.util.Scanner;

public class demo14 {
	static String fin = "";

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String user = s.nextLine();
		fin = user;
		System.out.println("enter the word that you wanna find");
		String word = s.nextLine();

		System.out.println("enter the word that you wanna replace");
		String replacement = s.nextLine();

		int x = findWord(user, word, replacement);
		System.out.println("String after replacement is: " + fin);
		
	}

	public static int findWord(String largeArray, String subArray, String replace) {
		int count = 0;
		int subArrayLength = subArray.length();
		int c=0;
		

		int limit = largeArray.length() - subArray.length();

		

		for (int i = 0; i <= limit; i++) {
			boolean subArrayFound = true;

			for (int j = 0; j < subArray.length(); j++) {
				if (subArray.charAt(j) != largeArray.charAt(i + j)) {
					subArrayFound = false;
					break;
				}
			}

			if (subArrayFound) {
				
				count++;
				System.out.println("Found at index: " + i);
				deleteWord(replace, i+((replace.length()-subArray.length())*c++),subArray);
			}
		}
		return count;
	}

	public static void deleteWord(String replace, int index, String word) {
		String h="";
		char[] original = new char[fin.length()];
		for (int i = 0; i < fin.length(); i++) {
			original[i] = fin.charAt(i);
		}
		for(int i=index+word.length();i<original.length;i++){
			original[i-word.length()]=original[i];
		}
		char[] newOriginal = new char[original.length-word.length()];
		for(int i=0;i<newOriginal.length;i++)
			newOriginal[i]=original[i];
		for(int i=0;i<newOriginal.length;i++)
			h+=newOriginal[i];
	    fin=modifierOfStrings(h, replace, index);
		
		

	}

public static String modifierOfStrings(String org, String repl, int index){
		
		int iterator;
		
		char[] arr1 = new char[org.length()];
		for(int i=0;i<org.length();i++){
			arr1[i]=org.charAt(i);
		}
		char[] arr2 = new char[org.length()+repl.length()];
		
		for(int i=0;i<index;i++)
			arr2[i]=org.charAt(i);
		iterator=0;
		for(int i=index;i<index+repl.length();i++)
			arr2[i]=repl.charAt(iterator++);
		iterator=index;
		for(int i=index+repl.length();i<org.length()+repl.length();i++){
			arr2[i]=org.charAt(iterator++);
		}
		String result="";
		for(int i=0;i<org.length()+repl.length();i++)
			result+=arr2[i];
		return result;
	}
}
