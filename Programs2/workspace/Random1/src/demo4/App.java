package demo4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		String[] colors = { "Magenta", "Red", "White", "Blue", "Cyan" };

		List<String> list = new ArrayList<String>();

		for (String color : colors)
			list.add(color);

		String[] removeColors = { "Red", "White", "Blue" };

		List<String> removeList = new ArrayList<String>();

		for (String color : removeColors)
			removeList.add(color);

		System.out.println("ArrayList: ");

		for (int count = 0; count < list.size(); count++)
			System.out.printf("%s ", list.get(count));

		System.out.println("\nArrayList after removing colors: ");

		removeColors(list, removeList);

		for (String color : list)
			System.out.printf("%s ", color);

	}

	private static void removeColors(Collection<String> list1, Collection<String> list2) {

		Iterator<String> iterator1 = list1.iterator();

		while (iterator1.hasNext()) {

			if (list2.contains(iterator1.next()))
				iterator1.remove();

		}

	}

}
