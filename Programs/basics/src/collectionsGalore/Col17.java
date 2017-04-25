package collectionsGalore;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person1{
	
	private int id;
	private String name;
	
	public Person1(int id,String name)
	{
		this.id = id;
		this.name = name;
		
		
	}

	public String toString()
	{
		
		return "(Id is: "+id+"; name is "+name+")";
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person1 other = (Person1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	
}


public class Col17 {

	public static void main(String[] args) {

		
		Person1 p1 = new Person1(0, "Bob");
		Person1 p2 = new Person1(1, "Sue");
		Person1 p3 = new Person1(2, "Mike");
		Person1 p4 = new Person1(1, "Sue");
		
		Map<Person1, Integer> map = new HashMap<Person1, Integer>();
		map.put(p1,1);
		map.put(p2,2);
		map.put(p3,3);
		map.put(p4,4);
		
	for(Person1 key : map.keySet())
		System.out.println(key + ": "+map.get(key));
	
	Set<Person1> set = new LinkedHashSet<Person1>();
	
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
		System.out.println(set);
		
		
	}

}
