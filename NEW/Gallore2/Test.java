package Gallore2;

class Job {
	public static void print() {
		System.out.println("Hello");
		// print2();
	}

	public void print2() {
		System.out.println("Hello");
		// print();
		// this.print();
		// Job.print();
	}
}

public class Test {

	public static void main(String[] args) {

		Job j1 = new Job();
		// Job j2 = new Job();

		/*
		 * if (!j1.equals(j2)) System.out.println("they're not equal"); if (j1
		 * instanceof Job) System.out.println("j1's an Object");
		 */

		Job.print();
		// System.out.println(j1.getClass());

	}

}
