package experimental;

import java.lang.reflect.Method;

public class demo4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m)
			System.out.println(m1.getName());
		
		
	}

}
