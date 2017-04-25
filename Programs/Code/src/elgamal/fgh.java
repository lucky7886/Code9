package elgamal;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class fgh implements Runnable{
Random r = new Random();
	int id;
	//private CountDownLatch latch;
	static int k1,k2,k3;
	int counter=0;
	int d=0;
	int o=0;
	int h=0;
	public fgh(int id){
		this.id = id;
		
	}
	public void run() {
		
		if(id==1){
			while(true){
				counter=0;
			k1 = 10000+r.nextInt(90000);
			
			for(int i=1;i<=k1;i++){
				
				if(k1%i==0)
					counter++;
				
			}
			if(counter==2){
				System.out.println(k1);
			
				
				break;
			}
		}
		}
		
		if(id==2){
			while(true){
			counter=0;	
			k2 = 10000+r.nextInt(90000);
			for(int i=1;i<=k2;i++){
				
				if(k2%i==0)
					counter++;
				
			}
			if(counter==2){
				System.out.println(k2);
			
				break;
		}
			}
		}
		if(id==3){
			while(true){
				counter=0;
				k3 = 10000+r.nextInt(90000);
			
			for(int i=1;i<=k3;i++){
				
				if(k3%i==0)
					counter++;
				
			}
			if(counter==2){
				System.out.println(k3);
			
		
				break;
		}
			}
		}
		
		
	}
	
	
	
	
	public static void main(String[] args){
		//CountDownLatch latch = new CountDownLatch(3);
		System.out.println("The three keys for vehicle A are: ");
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=1;i<4;i++)
			executor.submit(new fgh(i));
		executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(k3);
		//System.out.println(k2);
		//System.out.println(k1);
	}
	
	
	
}
