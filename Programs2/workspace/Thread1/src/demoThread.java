
class ThreadDemo extends Thread{
	
	static Thread tm;
	public void run(){
		try {
			tm.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
			System.out.println("Child method");
		
	}
	
	
}


public class demoThread {

	public static void main(String[] args) {
		/*try {
			Thread.currentThread().join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		ThreadDemo.tm = Thread.currentThread(); 
		ThreadDemo d = new ThreadDemo();
		d.start();
		try {
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
			System.out.println("Main method");
		
		
	}

}
