package demo3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

public static void main(String[] args){	
	List<Integer> list1 = new LinkedList<>();
	
	list1.add(1);
	list1.add(3);
	list1.add(2);
	list1.add(5);
	
	Iterator<Integer> it = list1.iterator();
	
	while(it.hasNext()){
		
	Integer value = it.next();
	
	System.out.println(value);
		
	}
	
	
	
}
}
