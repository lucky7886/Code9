package MathFactory;

public class PythagoreanTriplets {

	public static void main(String[] args) {

		for(int i=1;i<=500;i++)
			for(int j=1;j<=500;j++)
				for(int k=1;k<=500;k++)
					if(k*k==i*i+j*j)
						System.out.printf("(%d,%d,%d)\n",i,j,k);
		
	}

}
