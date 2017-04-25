package demo2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Person{
	
	private int id;
	private String name;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		
		return "id = "+id+" name = "+name;
		
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
		Person other = (Person) obj;
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


public class App {

	public static void main(String[] args) {

		HashMap<Person,Integer> map = new LinkedHashMap<Person, Integer>();
		
		Person p1 = new Person(1, "Ram");
		
		Person p2 = new Person(2, "Jimmy");
		
		
		map.put(p1, 80);
		map.put(p2, 90);
		map.put(new Person(2,"Clare"),100);
		map.put(new Person(4,"Ram"),110);
		
		for(Map.Entry<Person, Integer> entry : map.entrySet()){
			Person per1 = entry.getKey();
			Integer i1 = entry.getValue();
			System.out.println("("+per1+")"+": "+i1);
			
			
		}
		for(Person per : map.keySet()){
			System.out.println("("+per+")"+": "+map.get(per));
		}
		
		
	}

}
