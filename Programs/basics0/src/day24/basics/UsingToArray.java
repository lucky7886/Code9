package day24.basics;



import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray {

	public static void main(String[] args) {

	//	String[] abc = new String[10];
		String[] colors = {"black","blue","yellow"};
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));
		
		
		links.addLast("red");
		links.add("pink");
		links.add(3,"green");
		links.addFirst("cyan");
		
		
		for(String color : colors)
			System.out.println(color);
		System.out.println();
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors: ");
	
	for(String color : colors)
			System.out.println(color);
		
	System.out.println();
	
	for(String color:links)
		System.out.printf("%s ",color);
		
	}

}
