package Gallore2;

import java.util.Date;

public class GC {

	public static void main(String[] args) {

		/*Runtime rt = Runtime.getRuntime();

		System.out.println(rt.totalMemory());

		System.out.println(rt.freeMemory());
		Date n = null;
		for (int i = 0; i < 1000000; i++) {
			n = new Date();
			n = null;

		}

		System.out.println(rt.freeMemory());
		rt.gc();
		System.out.println(rt.freeMemory());*/
		System.out.println((int)(Math.random()*90)+10);
		
	}

	public void finalize() {
		//
	}

}
