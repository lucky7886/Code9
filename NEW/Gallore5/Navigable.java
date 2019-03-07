package Gallore5;
import java.util.*;
public class Navigable {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		
		TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet<Integer>) times.headSet(1600);
		System.out.println(subset.last());

		TreeSet<Integer> sub2 = new TreeSet<Integer>();
		sub2 = (TreeSet<Integer>)times.tailSet(2000);
		System.out.println(sub2.first());
		
		System.out.println(times.lower(1600));
		System.out.println(times.higher(2000));
		
		System.out.println(times.size());
		
		System.out.println(times.pollFirst());
		
		System.out.println(times.size());
	}

}
