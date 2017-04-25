package demo16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		Map<String,Integer> myMap = new HashMap<>();
		
		createMap(myMap);
		displayMap(myMap);
		
	}
	
	
	private static void createMap(Map<String,Integer> m){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine();
		String[] tokens = input.split(" ");
	for(String a:tokens){
		String word = a.toLowerCase();
		if(m.containsKey(word)){
			int count = m.get(word);
			m.put(word,count+1);
		}
		else
			m.put(word,1);
	}

}
	private static void displayMap(Map<String,Integer> map){
		Set<String> keys = map.keySet();
		TreeSet<String> sortedKeys = new TreeSet<String>(keys);
		System.out.println("\nMap contains:\nKey\t\tValue");
		for(String key:sortedKeys)
			System.out.printf("%-10s%10s\n",key,map.get(key));
	System.out.printf("\nsize: %d\nisEmpty: %b\n",map.size(),map.isEmpty());
	} 
	}
