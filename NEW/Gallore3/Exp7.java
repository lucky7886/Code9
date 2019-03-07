package Gallore3;

import java.util.*;

class Employee implements Comparable<Employee> {

	int age;
	int id;
	String name;

	Employee(int age, int id, String name) {
		this.age = age;
		this.id = id;
		this.name = name;
	}

	public int compareTo(Employee o) {
		if (this.id > o.id)
			return 1;
		else if (this.id < o.id)
			return -1;
		else
			return 0;
	}

	public String toString() {
		return "Employee is: " + name + ", " + id + ", " + age;
	}
}

public class Exp7 {
	public static void main(String[] args) {
		Employee e1 = new Employee(23, 2, "ANNA");
		Employee e2 = new Employee(27, 3, "PETER");
		Employee e3 = new Employee(33, 1, "AMAN");
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
