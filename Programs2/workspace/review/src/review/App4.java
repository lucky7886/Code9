package review;

import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		String line = input.nextLine();
		String word = "";
		String largeWord = "";
		int i,l,lw,max=0,c=0;
		char ch;
		line = line + " ";
		l=line.length();
		for(i=0;i<l;i++){
			
			ch = line.charAt(i);
			if(ch!=' '){
				word = word+ch;
			}
			else{
				lw=word.length();
				if(lw>max){
					max=lw;
			largeWord=word;
				}
				word="";
			}
			
		}
System.out.println("Largest word: " + largeWord);
	}

}
