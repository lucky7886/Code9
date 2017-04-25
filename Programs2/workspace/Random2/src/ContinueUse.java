import java.util.Random;

public class ContinueUse {

	public static void main(String[] args) {

		Random r = new Random();
		
		for(int i=0;i<5;i++){
		int	m=r.nextInt(5);
			if(m==1){
				System.out.println(m);
				System.out.println("Hello");
			}
				else
				continue;
			
			
			
		}
		
		
	}

}
