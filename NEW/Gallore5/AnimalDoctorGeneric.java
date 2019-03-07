package Gallore5;
import java.util.*;

class Animal5{}

class Dog5 extends Animal5 {
}

class Bird5 extends Animal5{
}

class Cat5 extends Animal5{
}

public class AnimalDoctorGeneric {

	public void checkAnimals(List<Animal5> animals) {
		for(Animal5 a : animals) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		List<Dog5> dogs = new ArrayList<>();
		dogs.add(new Dog5());
		dogs.add(new Dog5());
		List<Cat5> cats = new ArrayList<>();
		cats.add(new Cat5());
		cats.add(new Cat5());
		List<Bird5> birds = new ArrayList<>();
		birds.add(new Bird5());
		birds.add(new Bird5());
		AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
	//	doc.checkAnimals(dogs);
	}

}
