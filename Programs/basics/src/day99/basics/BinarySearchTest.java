package day99.basics;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class BinarySearchTest {

	public static void main(String[] args) {

		
		String[] arr = {"45","67","23","54","32","99","87","10","49"};
		
		List<String> list = new ArrayList<String>( Arrays.asList(arr));
		
		Collections.sort(list);
		
		System.out.printf("Sorted ArrayList: %s\n",list);
		
		printSearchResults(list,arr[2]);
		printSearchResults(list,"55");
		printSearchResults(list,"87");
		printSearchResults(list,arr[4]);	
	}

	private static void printSearchResults(List<String> list,String key)
	{
		
		int result = 0;
		
		System.out.printf("\nSearching for: %s\n",key);
		result = Collections.binarySearch(list,key);
		if(result>=0)
			System.out.printf("Found at index %d\n",result);
		else
			System.out.printf("Not found (%d)\n",result);
		
		
	}
	
}
