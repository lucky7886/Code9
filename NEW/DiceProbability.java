import java.util.Random;

public class DiceProbability {

	public static void main(String[] args) {
		
		
		Random r = new Random();
		
		int peterSum=0;
		int peterWins=0;
		int colinSum=0;
		int colinWins=0;
		int rounds=10000000;
		int c=0;
		for(int i=0;i<rounds;i++) {
			//System.out.println();
			for(int j=0;j<9;j++) {
				c=1+r.nextInt(4);
			//	System.out.println(c);
				peterSum+=c;
			}
			//System.out.println();
			for(int k=0;k<6;k++){
				c=1+r.nextInt(6);
			//	System.out.println(c);
				colinSum+=c;
			}
			if(peterSum>colinSum)
				peterWins++;
			else if(peterSum<colinSum)
				colinWins++;
		}
		System.out.println("Results:----");
		System.out.println(peterWins);
		System.out.println(colinWins);
		System.out.println((double)peterWins/rounds);

	}

}
