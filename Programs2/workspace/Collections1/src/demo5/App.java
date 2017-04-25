package demo5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {


	//	Set<String> set1 = new HashSet<String>();
		
	//	Set<String> set1 = new LinkedHashSet<String>();
		
		Set<String> set1 = new TreeSet<String>();
		
		
		if(set1.isEmpty()){
			System.out.println("set is empty");
		}		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("bear");
		set1.add("fish");
		
		
		
		System.out.println(set1);
		
		for(String element : set1){
			System.out.print(element+", ");
		}	
			if(set1.contains("aadvark"))
				System.out.println("contains aadvark");
			
			if(set1.contains("cat"))
				System.out.println("contains cat");
			
			if(set1.isEmpty()){
				System.out.println("set is empty");
			}
			
			Set<String> set2 = new TreeSet<String>();
			set2.add("dog");
			set2.add("cat");
			set2.add("giraffe");
			set2.add("monkey");
			set2.add("ant");
			
			Set<String> intersection = new HashSet<String>(set1);
			
			System.out.println(intersection);
			intersection.retainAll(set2);
			System.out.println(intersection);
		
			Set<String> difference = new HashSet<String>(set2);
	
	difference.removeAll(set1);
	System.out.println(difference);
	}
		
	}
