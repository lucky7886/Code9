package demo4;

import java.util.Scanner;

class Processor extends Thread {
 int c = 0;
	private volatile boolean running = true;

	public void run() {
 
		while (running) {
			c++;
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		running = false;

	}
}

public class App {

	public static void main(String[] args) {
	
		Processor proc1 = new Processor();
		proc1.start();
		Processor proc2 = new Processor();
		proc2.start();
	System.out.println("Press return to stop...");
	Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	
	    proc1.shutdown();
	    
	    proc2.shutdown();
		System.out.println(proc1.c);
		System.out.println(proc2.c);
	}

}
