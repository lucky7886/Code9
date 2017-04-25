package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1>len2)
			return 1;
		else if(len1<len2)
			return -1;
		else
		return 0;
	}
	
}

public class App {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of names you wanna give:");
		int n = input.nextInt();
		String[] arr = new String[n];
		int m=n;
		System.out.println("Enter the name: ");
		input.nextLine();
		arr[0] = input.nextLine();
		
			for(int i=1;i<n;i++){
			System.out.println("Enter another name: ");
		    arr[i] = input.nextLine();
		  
			}
		List<String> list = new ArrayList<String>();
		list =  Arrays.asList(arr);
		Collections.sort(list, new StringLengthComparator());
/*		
		Collections.sort(list, new Comparator<String>(){

			
			public int compare(String s1, String s2) {
				int len1 = s1.length();
				int len2 = s2.length();
				if(len1>len2)
					return 1;
				else if(len1<len2)
					return -1;
				else
				return 0;
			}
			
		});
		*/
		/*
		 String star ="*";
		 int [] h= {1, 0, 4, 7, 9, 14, 26, 10, 4, 1};
		 for (int i=0; i <h.length; i++) {
			for(int j = 0; j < h[i]; j++) 
			   System.out.print(star);
			System.out.println();
	*/	
	System.out.println("Sorting (According to String length): \n");
		arr = list.toArray(new String[list.size()]);
		for(String name : arr)
			System.out.println(name);
		System.out.println("\n\n");
		Collections.sort(list, new Comparator<String>(){

			
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
			
		});
		System.out.println("Sorting (In Alphabetical Order): \n");
		arr = list.toArray(new String[list.size()]);
		for(String name : arr)
			System.out.println(name);
		
	}
	
	

}
