package day18.basics;
import java.util.ArrayList;
public class ArrayListCollection {

	public static void main(String[] args) {

		ArrayList <String> items = new ArrayList<String>();
		
		items.add("red");
		items.add(1,"yellow");
		System.out.print("Display list contents with counter controlled loop:");
		for(int i=0;i<items.size();i++)
		
			
			System.out.printf(" %s",items.get(i));
		display(items,"\ndisplay list contents with enhanced for statement:");
		items.add("green");
		items.add("yellow");
		display(items,"list with two new elements:");
items.remove("yellow");
items.remove(0);
display(items,"remove second list element (green):");
System.out.printf("\"red\" is %sin the list \n",items.contains("red")?"":"not");
System.out.printf("size: %s\n",items.size());

	}
	public static void display(ArrayList<String> items,String header)
	{
		System.out.print(header);
		for(String item : items)
		System.out.printf(" %s",item);
		System.out.println();
	}

		
	}


