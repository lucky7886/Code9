package collectionsGalore;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import java.util.List;
public class SetTest {

	public static void main(String[] args) {

		String[] colors = {"red","white","blue","green","gray","orange",
				"tan","white","cyan","peach","gray","orange"};
		List<String> list = Arrays.asList(colors);
		
		System.out.printf("List: %s\n",list);
		
		printNonDuplicates(list);
		
	}
	
	private static void printNonDuplicates(Collection<String> values)
	
	{
		
		Set<String> set = new HashSet<String>(values);
		
		System.out.print("\nNonDuplicates are: ");
		
		for(String s : set)
			System.out.printf("%s ",s);
		System.out.println();
			
		
		
		
	}

}
