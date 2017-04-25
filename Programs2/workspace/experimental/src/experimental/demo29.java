package experimental;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class demo29 {

	public static void main(String[] args) {
Random r = new Random();
Scanner input = new Scanner(System.in);
Set<String> set = new HashSet<String>();
System.out.println("Enter the string");
		String name = input.nextLine();
		System.out.println("Enter the number of combination of letter: ");
		int number = input.nextInt();
		String out ="";
		int c=0;
		int w=100000;
		char[] name1 = new char[number];
		while(w!=0){
			out="";
			int[] num = new int[name.length()];
			for(int i=0;i<name.length();i++)
				num[i]=i;
			for(int i=0;i<number;i++){
			while(true){
				int index = r.nextInt(name.length());
			c=num[index];
			if(c!=-1){
			num[index]=-1;
			break;
			}
			}
			name1[i]=name.charAt(c);
		out+=name1[i];
		}
		//System.out.println(out);
			set.add(out);
		w--;
	}
		for (String s : set) {
		    System.out.println(s);
		}
		//System.out.println(set);
		System.out.println(set.size());
}
}