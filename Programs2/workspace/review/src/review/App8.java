package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App8 {

	public static void main(String[] args) throws IOException {

		//Scanner input = new Scanner(System.in);
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter the number of elements: ");
		int n = Integer.parseInt(br.readLine());
		//int n = input.nextInt(); 
		int[][] A = new int[n][n];
		int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
		
		while(k<=n*n){
			for(int i=c1;i<=c2;i++){
				A[r1][i]=k++;
			}
			for(int j=r1+1;j<=r2;j++){
				A[j][c2]=k++;
			}
			for(int i=c2-1;i>=c1;i--){
				A[r2][i]=k++;
			}
			for(int j=r2-1;j>=r1+1;j--){
				A[j][c1]=k++;
			}
			c1++;
			c2--;
			r1++;
			r2--;
			
			
			
		}
		
		System.out.println("the circular matrix is: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(A[i][j]+"\t");
		}
		System.out.println();
	}
	}
}
