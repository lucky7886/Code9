package collectionsGalore;
import java.util.*;
public class col5 {

	public static void main(String[] args) {

	Character[] ray = {'p','w','n'};
	
	List<Character> l = Arrays.asList(ray);
	System.out.println("List is : ");
	output(l);
		
	Collections.reverse(l);
	System.out.println("After reverse : ");
	output(l);
	Character[] newRay = new Character[3];
	List<Character> listCopy = Arrays.asList(newRay);
	Collections.copy(listCopy,l);
	System.out.println("Copy of list : ");
	output(listCopy);
	
	Collections.fill(l, 'X');
	System.out.println("After filling the list : ");
	output(l);
	}
private static void output(List<Character> theList) 
{
for(Character thing : theList)
	System.out.printf("%s ",thing);

}
}
