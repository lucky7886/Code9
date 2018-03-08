
public class ID12 {

	public static void main(String[] args) {
		int count=0;
		int n=1;
		for(int i=0;i<Integer.MAX_VALUE;i++){
		
			if(i==(n*(n+1))/2){
		//		System.out.print(i+": ");
			count = factors(i);
				n++;
				System.out.println();
			}
		if(count>=500){
			System.out.println("\n\n"+i);
			break;
		}
		}
		
			
	}

	static int factors(int num){
		int count=0;
		for(int i=1;i<=num;i++)
			if(num%i==0){
		//		System.out.print(i+",");
				count++;
			}
		return count;
	}
	
}
