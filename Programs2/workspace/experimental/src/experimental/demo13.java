package experimental;

import java.util.Scanner;

public class demo13 {
static String fin="";
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
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
		
		

	}


