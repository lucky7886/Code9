package demo2;

class Runner implements Runnable{

	
	public void run() {
		
		for(int i=0;i<10;i++){
			System.out.println("Hello "+i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}	



public class App {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(new Runner());
		t1.start();
		t2.start();
	}

}