package experimental;

import java.util.Scanner;
import java.util.StringTokenizer;

public class demo1 {
static String fin = "";
	public static void main(String[] args) {
StringTokenizer t = new StringTokenizer("");
		/*int i = '0';
		char c = '9';
		System.out.println(c);
		System.out.println(i);*/
		



		Scanner s = new Scanner(System.in);
		char s1 = 'Z';
		int val = s1;
		char d = toLower('A');

		
		
		
		
		//System.out.println(d);
		//System.out.println("enter some characters");
		//String read = s.nextLine();
		//char inputFromUser = read.charAt(3);
		//System.out.println(inputFromUser);
             /*char c = Character.toLowerCase('A');
             String str = "prsa";
          char[] ch = new char[str.length()];
             for(int i=0; i<str.length();i++)
             ch[i] = str.charAt(i);
             
             String h = "";
             for(int i=0;i<ch.length;i++){
            	 h+=ch[i];
             }*/
             //System.out.println(h);
             //  boolean t = str.contains("sd");
           // System.out.println(t);
	
		
		
		
		
		
		
		
		
		int count=0,count1=0;
	char ch=' ';
	System.out.println("Enter a string");
	String user = s.nextLine();
	fin = user;
	System.out.println("enter the word that you wanna find");
	String word = s.nextLine();

	System.out.println("enter the word that you wanna replace");
	String replacement = s.nextLine();
	
	
	int x = findWord(user,word,replacement);
	System.out.println("String after replacement is: "+fin);
	//boolean res = recurrrenceFinder(user, word);
	//System.out.println(res);
	}	
	public static int findWord(String largeArray, String subArray, String replace) {
        int count = 0;
	    int subArrayLength = subArray.length();
/*
	    if (subArrayLength == 0) {
	        return -1;
	    }*/

	    int limit = largeArray.length() - subArrayLength;

	   // int i=0;

	    for (int i = 0; i <= limit; i++) {
	        boolean subArrayFound = true;

	        for (int j = 0; j < subArrayLength; j++) {
	            if (subArray.charAt(j) != largeArray.charAt(i+j)) {
	                subArrayFound = false;
	                break;
	            }
	        }
	        /* Sub array found - return its index */
	        if (subArrayFound) {
	       count++; 
	  	            System.out.println("Found at index: "+i);
	        replaceWord(replace,i,largeArray.length());
	        }
	    }

	    /* Return default value */
	//    return -1;
	
	    return count;
	
	
	
	}
	
	 
	
	
	
	
	
	public static void replaceWord(String replace,int index,int len) {
		char[] original = new char[fin.length()];
		for(int i=0;i<fin.length();i++){
			original[i]=fin.charAt(i);
		}
		
		for(int i=0;i<replace.length();i++)
		original[index++]=replace.charAt(i);
		fin="";
		for(int i=0;i<len;i++)
			fin+=original[i];
	}
	
	
	
	
	
	
	
	public static boolean recurrrenceFinder(String original, String word){
		char ch=' ';
		char ch2 = ' ';
        int counter = 0;
        int var = 0;
		for(int i=0;i<word.length();i++){
		ch = word.charAt(i);
			for(int j=0;j<original.length();j++)
			{
				
				if(ch == original.charAt(j)){
					counter++;
				break;
				}
			}
			
		}
		if(counter==word.length())
			return true;
		else 
			return false;
	}
	
	
	
	
	
	public static void checker(String org,String word,int q,int w){
		int i=0;
		
		char h = org.charAt(i);
		for(int l=0;l<org.length();l++){
			
			if(h==org.charAt(l)){
			
			
			}
		}
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	/*for(int i=0;i<user.length();i++){
		ch=user.charAt(i);
		if(Character.isUpperCase(ch)){
			count++;
		}
		if(Character.isLowerCase(ch)){
			count1++;
		}
		
	}*/
	//System.out.println("the num of upper case letters is: "+count);
	//System.out.println("the num of lower case letters is: "+count1);
	/*String reverse = reverse(user);
             System.out.println(reverse);
	*/
	

	
	
	
	
	
	
	
	
	
	
	
	public static String reverse(String user){
		char[] ch = new char[user.length()];
        for(int i=0; i<user.length();i++)
        ch[i] = user.charAt(i);
		String rev="";
		for(int i=user.length()-1;i>=0;i--){
			rev+=ch[i];
		}
		
		return rev;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static char toLower(char c){
		
		if(c>='A' && c<='Z')
		return (char)(c-'A'+'a');
		else 
			return c;
	}
	
	public static char[] ch(char[] a){
		char[] b={};
		return b;
	}
}
