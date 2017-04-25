package MathFactory;
import java.io.*;
public class FactorsofNumber {
	public static void main(String[] args) throws Exception {
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int num = Integer.parseInt(m.readLine());
int c=0;

System.out.printf("The factors of %d are: ",num);

for(int i=1;i<=num;i++)

	if(num%i==0){
	c++;	
	System.out.printf("%d ",i);
	

}	
System.out.printf("\nTotal: %d",c);
}
}