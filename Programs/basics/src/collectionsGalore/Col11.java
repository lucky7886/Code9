
package collectionsGalore;
import java.util.*;
public class Col11 {

	public static void main(String[] args) {
		
		Integer[] iray = {1,2,3,4,5};
		Character[] cray = {'b','u','c','k','y'};
		
		printMe(iray);
		printMe(cray);
		
	}
public static <T> void printMe(T[] x)
{
for(T b : x)
	System.out.printf("%s ",b);
System.out.println();

}
	
	
	
}
