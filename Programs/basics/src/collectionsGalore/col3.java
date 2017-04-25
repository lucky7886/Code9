package collectionsGalore;
import java.util.*;
public class col3 {

	public static void main(String[] args) {

		String[] stuff  =  {"babies","watermelong","melons","fudge"};
		
		LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));
		
		theList.add("pumpking");
		theList.addFirst("firstthing");

		stuff = theList.toArray(new String[theList.size()]);
		
		for(String x : stuff)
			System.out.printf("%s ",x);
	}

}
