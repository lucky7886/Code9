
public class problem16 {


	public static void swap(int a, int b){
		int c = a;
		a=b;
		b=c;
	}
	
	public static void main(String[] args) {
		int a=5;
		int b=10;	
		problem16 p16 = new problem16();
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}

}
