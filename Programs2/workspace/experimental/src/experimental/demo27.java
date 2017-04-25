package experimental;

public class demo27 {

	public static void main(String[] args) {

		
		//System.out.println(3%6);
		System.out.println(hcf(12,9));
		System.out.println(lcm(6,12));
	}
	
	public static int lcm(int num1, int num2){
		/*if(num1%num2==0 || num2%num1==0)
		{
			if(num1>num2)
				return num1;
			else
				return num2;
		}
		else*/
			return num1*num2/hcf(num1,num2);
	}
	
	public static int hcf(int num1, int num2){
		int a;
		int b;
	/*	if(num1>num2){
		a=num1;
		b=num2;
		}
		else{
		 a=num2;
		 b=num1;
		}*/
		a=num1;
		b=num2;
		int t=a%b;
		while(t!=0){
			a=b;
			b=t;
			t=a%b;
		}
		return b;
	}

}
