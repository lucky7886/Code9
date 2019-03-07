package Gallore3;

import java.util.Map;

import java.util.HashMap;

class Dog3 {

	public Dog3(String n) {

		name = n;

	}

	public String name;

	public boolean equals(Object o) {
		if (o instanceof Dog3 && ((Dog3) o).name == name) {
			return true;
		} else
			return false;
	}

	public int hashCode() {

		return name.length();

	}

	public String toString() {
		return name;
	}

}

class Cat3 {

}

enum Pets {
	DOG, HORSE, CAT
}

public class MapTest {

	public static void main(String[] args) {
		Map<Object, Object> m = new HashMap<>();

		m.put("k1", new Dog3("aiko"));
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "Cat key");

		m.put(new Cat3(), "Cat key");

		Dog3 d1 = new Dog3("clover");
		m.put(d1, "Dog key");
		System.out.println(m.get(d1));
		d1.name = "prateek";
		System.out.println(m.get(d1));
		d1.name = "pratee";
		System.out.println(m.get(d1));

		/*
		 * System.out.println(m.get("k1")); String k2 = "k2";
		 * System.out.println(m.get(k2)); Pets p = Pets.CAT;
		 * System.out.println(m.get(p));
		 * 
		 * System.out.println(m.get(new Cat3())); System.out.println(m.size());
		 * System.out.println(m.get("k3")); m.put(null, null); m.put(null, null);
		 * System.out.println(m.get(null)); System.out.println(m.size()); //
		 * System.out.println(m.get(d1)); System.out.println();
		 */

	}

}
