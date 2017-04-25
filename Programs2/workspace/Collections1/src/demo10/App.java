package demo10;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {


		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("Fox");
		animals.add("Cat");
		animals.add("Dog");
		
		
		Iterator<String> it = animals.iterator();
		
		
		
		while(it.hasNext()){
			String value = it.next();
			System.out.println(value);
			if(value.equals("Cat"))
				it.remove();
		}
		
	//	String value = it.next();
		
	//	System.out.println(value);
		
		/////Modern Iteration////
		
		for(String animal : animals){
			System.out.println(animal);
		}
	}

}
