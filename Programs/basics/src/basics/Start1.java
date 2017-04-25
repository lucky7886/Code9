package basics;

class Person {

	String name;
	int age;

	void speak() {
		System.out.println("My name is: " + name + " and my age is: " + age);
	}

	Person(String s, int n) {
		name = s;
		age = n;
	}
}

public class Start1 {

	public static void main(String[] args) {
		Person person1 = new Person("Joe Bloggs", 29);

		Person person2 = new Person("Sarah Smith", 31);
person1.speak();
person2.speak();
	}

}
