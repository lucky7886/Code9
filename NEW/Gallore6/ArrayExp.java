package Gallore6;

import java.util.ArrayList;
import java.util.List;

class Animal6 {
}

class Dog6 extends Animal6 {
}

class Cat6 extends Animal6 {
}

class Bird6 {
}

class Shepherd extends Dog6 {
}

public class ArrayExp {

	public static void main(String[] args) {

		
	//	List<Object> list = new ArrayList<String>();
		Animal6[] arr = new Dog6[5];

	//	 arr[0] = new Animal6();    // false   run-time

	//	arr[1] = new Dog6();     //true
		
	//	arr[2] = new Cat6();     //false   compile time

		arr[3] = new Shepherd();   //true
//	arr[1] = new Bird6();      //false  compile time

	}

}
