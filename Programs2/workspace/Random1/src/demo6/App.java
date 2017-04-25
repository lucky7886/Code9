package demo6;

import java.util.Arrays;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {


String[] colors = {"black","blue","yellow"};
		
LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));
		
links.addLast("red");
links.add("pink");
links.add(3, "green");
links.addFirst("cyan");

colors = links.toArray(new String[links.size()]);

System.out.println("colors: ");

for(String color : colors)
	System.out.printf("%s ",color);

links.removeLast();
System.out.println();
for(String color : links)
	System.out.printf("%s ",color);
System.out.println();
for(String color : colors)
	System.out.printf("%s ",color);
		
	}

}
