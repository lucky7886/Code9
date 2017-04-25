package day99.basics;
import java.util.ArrayList;
public class ArrayListCollection {

	public static void main(String[] args) {

ArrayList<String> items = new ArrayList<String>();

items.add("red");
items.add(0,"yellow");


for(int i=0;i<items.size();i++)
	System.out.printf("%s ",items.get(i));

display(items,"display list with enhanced for statement:");

items.add("green");
items.add("yellow");

display(items,"list with two new elements:");

items.remove("yellow");

display(items,"remove first instance of yellow");

items.remove(1);
display(items,"remove second list element");
		
	}

	public static void display(ArrayList<String> items,String header)
	{
		
		System.out.print(header);
		for(String item : items)
			System.out.printf(" %s",item);
		System.out.println();
		
		
		
	}
	
}
