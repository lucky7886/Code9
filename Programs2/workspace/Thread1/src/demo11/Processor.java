package demo11;

import java.util.LinkedList;
import java.util.Random;

public class Processor {

	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	
	private final int LIMIT = 500;
	private Object lock = new Object();
	public void produce() throws InterruptedException{
		int value = 0;
		System.out.println(list.size()+"con");
		Random random = new Random();
		while(true){
			synchronized(lock){
		while(list.size()==LIMIT){
			lock.wait();
		}
				list.add(value++);
				lock.notify();
		}
		//	Thread.sleep(random.nextInt(1000));
		}
	}
	
	
	public void consume() throws InterruptedException{
		
		System.out.println(list.size()+"pro");
		while(true){
			synchronized(lock){
				while(list.size()==0){
					lock.wait();
				}
			System.out.print("List size is: "+list.size());
			int value = list.removeLast();
			System.out.println("; value is: "+value);
			//lock.notify();
		}
			
		}
		
	}
	
	
}
