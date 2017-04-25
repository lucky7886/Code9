package MathFactory;
public class InfiniteSum {

	public static void main(String[] args) {

		double sum = 1;
		double j = 2;
		for(int i=1; i <= 31; i++){
		sum+=1/j;
/*
		if(sum == 2.0)
{
	j=i;		
	break;
		}
*/
		j*=2;
		}
		System.out.println(sum);
	//	System.out.println(j-1);
		
		
	}

}
