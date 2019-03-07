package Gallore3;

import java.util.*;
import java.util.Comparator;

class util implements Comparator<Employeee> {

	public int compare(Employeee arg0, Employeee arg1) {
		int flag = arg0.age - arg1.age;
		if (flag == 0)
			return arg0.name.compareTo(arg1.name);
		return flag;
	}
}

class Employeee {
	int age;
	int id;
	String name;

	Employeee(int age, int id, String name) {
		this.age = age;
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Employee is: " + name + ", " + id + ", " + age;
	}
}

public class Exp8 {
	public static void main(String[] args) {
		Employeee e1 = new Employeee(33, 2, "ANNA");
		Employeee e2 = new Employeee(27, 3, "PETER");
		Employeee e3 = new Employeee(33, 1, "AMAN");
		List<Employeee> list = new ArrayList<Employeee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list, new util());
		System.out.println(list);
	}

}
