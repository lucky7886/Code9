package demo3;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		
		map.put(5, "five");
		map.put(6, "six");
		map.put(1, "one");
		map.put(9, "nine");
		map.put(4, "four");
		
		
		
		String text = map.get(6);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
		
		System.out.println(key+": "+value);
		}
		
	}

}
