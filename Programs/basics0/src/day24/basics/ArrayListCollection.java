package day24.basics;
import java.util.ArrayList;
public class ArrayListCollection {

	public static void main(String[] args) {

		
		ArrayList <String> items = new ArrayList<String>();
		
		
		items.add("red");
		items.add(0,"yellow");
		
		System.out.print("display list contents with counter controlled loop: ");
		
		for(int i=0;i<items.size();i++)
			System.out.printf(" %s", items.get(i));
		
		display(items,"\ndisplay list content with enhanced for statement: ");
		
		
		items.add("green");
		
		items.add("yellow");
		
		display(items,"list with two new elements");
		
		items.remove("yellow");
		
		display(items,"remove first instance of yellow");
		
		
		items.remove(1);
		
		
		display(items, "remove second list element (green):");
		
		System.out.printf("\"red\" is %s in the list\n",items.contains("red")?"":"not ");
		
	}

	private static void display(ArrayList<String> items, String header) {
		
		System.out.print(header);
		
		for(String item:items)
			System.out.printf(" %s",item);
		
		System.out.println();
		
	}

}
