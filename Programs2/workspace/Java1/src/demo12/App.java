package demo12;

import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}

public class App {
public static void main(String[] args){
	
	///////Before java 5////////
	ArrayList list = new ArrayList();
	list.add("apple");
	list.add("orange");
	list.add("banana");
	
	String fruit = (String)list.get(1);
	System.out.println(fruit);
	
	////////Modern style//////
	
	ArrayList<String> strings = new ArrayList<String>();
	
	strings.add("cat");
	strings.add("dog");
	strings.add("alligator");
	
	String animal = strings.get(1);
	System.out.println(animal);
	
	
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	
	ArrayList<Animal> arr = new ArrayList<>();
}
}
