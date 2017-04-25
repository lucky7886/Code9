package day1.basics;
import java.util.Random;
public class DieTwo {

	public static void main(String[] args) {

		Random R = new Random();
		
		int p1=0;
		int p2=0;
		
		int face1,face2;
		
		for(int i=0;i<6000000;i++)
		{
			
			face1 = 1+R.nextInt(6);
			face2 = 1+R.nextInt(6);
			
			if(face1<=4 && face2<=4)
		     	++p1;
			else
				++p2;
			
			
		}
		System.out.printf("player 1 wins %d times\n\n",p1 );
		System.out.printf("player 2 wins %d times ",p2 );
		
		
		
	}

}
