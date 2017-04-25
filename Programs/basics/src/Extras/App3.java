package Extras;

public class App3 {

	public static void main(String[] args) {
         Animal[] animal;
		//calc(6);
         animal = new Animal[1000000];
		
         for(int i=0;i<1000000;i++)
        	 animal[i]=new Animal();
         
         for(int i=0;i<1000000;i++){
        	 
         
        	 animal[i].a=1;
        animal[i].b=1;
        animal[i].c = "cat";
         }
         System.out.println(animal[504587].c);
	}
	/*	public static void calc(int val){
			
		System.out.println(val);
		
		calc(val-1);
			
		}	
	*/
}
	class Animal{
		int a;
		int b;
		String c;
	}
	


