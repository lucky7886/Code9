package collectionsGalore;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Col16 {

	public static void main(String[] args) {		// TODO Auto-generated method stub
//HashSet does not retain order
//Set<String> set1 = new HashSet<String>();
//Set<String> set1 = new LinkedHashSet<String>();
Set<String> set1 = new TreeSet<String>();	
if(set1.isEmpty())
	System.out.println("Set is empty at start");
set1.add("dog");

set1.add("cat");

set1.add("mouse");

set1.add("snake");

set1.add("bear");
if(set1.isEmpty())
	System.out.println("Set is empty at start");		
		System.out.println(set1);
		
for(String element : set1)
	System.out.println(element);
	
if(set1.contains("sadvark"))
	System.out.println("contains sadvark");
if(set1.contains("cat"))
	System.out.println("contains cat");
	
	Set<String> set2 = new TreeSet<String>();	
	if(set2.isEmpty())
		System.out.println("Set is empty at start");
	set2.add("dog");

	set2.add("cat");

	set2.add("giraffe");

	set2.add("monkey");

	set2.add("ant");
	
	Set<String> intersection = new HashSet<String>(set1);
	
	System.out.println(intersection);
	
	intersection.retainAll(set2);
	System.out.println(intersection);
	Set<String> difference = new HashSet<String>(set1);
	difference.removeAll(set2);
	System.out.println(difference);
	
	}
	}