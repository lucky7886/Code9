
public class Thread5 {

	static int a=1;
	static int b=0;
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				method1();
				
			}
			
		}
		);
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				
				method2();
			}
			
		}
		);
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void method1(){
		while(true){
			
			
			if(a>0){
				a--;
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.print("1");
			b++;
			}
			}
		}
		
	}
	
	public static void method2(){
		while(true){
			
			if(b>0){
				b--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.print("0");
			a++;
			}
			
		}
	}
	
}
