package basics;

import java.util.ArrayList;

public class App1 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("Banana");
		list.add("Orange");
		
		String fruit = (String)list.get(2);
		
		System.out.println(fruit);
		
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		ArrayList list2 = new ArrayList();
		
		list2.add("5"); 
		list2.add("fruit");
		
		String m = (String)list2.get(0);
		int n = Integer.parseUnsignedInt(m);
		System.out.println(n+1);
		
		ArrayList<String> strings1 = new ArrayList<String>();
		strings1.add("Cat");
		strings1.add("Dog");
		strings1.add("Alligator");
		
		String animal1 = (String)strings1.get(1);
	System.out.println(animal1);
	
	}

}
