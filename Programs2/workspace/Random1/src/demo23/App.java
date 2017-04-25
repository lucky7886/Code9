package demo23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App implements Runnable {
 //static int  sum = 0;
//private Object lock = new Object();
	int id;
	
	//static Set<Integer> list = new TreeSet<Integer>();
static	Set list = Collections.synchronizedSet(new LinkedHashSet());
	public App(int id){
	this.id = id;
}

int c=0;
int v=0;
int b=0;
int m=0;
int l=0;
int u=0;
	@Override
	public void run() {
		System.out.println("Starting id "+id);
		
	if(id==0)
	{
		for(int i=2;i<30000;i++){
			c=0;
		
		for(int z=1;z<=i;z++){
			if(i%z==0)
				c++;
		}
			if(c==2)
				addition(i);
		}
		}
	
	if(id==1)
	{
		for(int i=30000;i<50000;i++){
			v=0;
		
		for(int z=1;z<=i;z++){
			if(i%z==0)
				v++;
		}
			if(v==2)
				addition(i);
		}
		}
	if(id==2)
	{
		for(int i=50000;i<70000;i++){
			b=0;
		
		for(int z=1;z<=i;z++){
			if(i%z==0)
				b++;
		}
			if(b==2)
				addition(i);
		}
		}
	if(id==3)
	{
		for(int i=70000;i<80000;i++){
			m=0;
		
		for(int z=1;z<=i;z++){
			if(i%z==0)
				m++;
		}
			if(m==2)
				addition(i);
		}
		}
	
	if(id==4)
	{
		for(int i=80000;i<90000;i++){
			l=0;
		
		for(int z=1;z<=i;z++){
			if(i%z==0)
				l++;
		}
			if(l==2)
				addition(i);
		}
		}
	if(id==5)
	{
		for(int i=90000;i<100000;i++){
			u=0;
		
		for(int z=1;z<=i;z++){
			if(i%z==0)
				u++;
		}
			if(u==2)
				addition(i);
		}
		}
	
	System.out.println("Completed id "+id);
	}
	public  void addition(int q){
		//synchronized (list){
		list.add(q);
	
	}
	//}
	
		
	
		
	
	public static void main(String[] args) {
ExecutorService executor = Executors.newFixedThreadPool(6);
long  a = System.currentTimeMillis();
for(int i=0;i<6;i++)
	executor.submit(new App(i));
executor.shutdown();

try {
	executor.awaitTermination(1, TimeUnit.DAYS);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

long  b = System.currentTimeMillis();
System.out.printf("\nTotal time: %d",b-a);
System.out.println("\n"+list+"\n"+list.size()+" primes.");

	}

}
