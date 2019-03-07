
package Gallore3;

import java.lang.System;
import java.util.*;

class bbb {

}

class qqq extends bbb {

}

public class Exp2 extends qqq {

	public static void main(String[] args) {

		checkInstanceOf(new Exp2());

		checkInstanceOf(new bbb());

		checkInstanceOf(new qqq());

	}

	public static void checkInstanceOf(Object q1) {
		if (q1 instanceof bbb)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
