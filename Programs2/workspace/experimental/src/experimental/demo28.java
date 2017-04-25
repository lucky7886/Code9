package experimental;

public class demo28 {

	public static void main(String[] args) {

		System.out.println(hcfRecur(12, 18));
			
	}
	public static int hcfRecur(int num1, int num2){
		
		if(num2==0)
			return num1;
		else
		return	hcfRecur(num2,num1%num2);
		
	}

}
