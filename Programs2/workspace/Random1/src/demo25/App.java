package demo25;

//import java.util.Map;
//import java.util.TreeMap;

//public class App {

	//public static void main(String[] args) {
/*BigInteger a = new BigInteger(""+9);
Random r = new Random();
int c= 999999999;
BigInteger b=a.probablePrime(32, r);
//System.out.println(b);
int c1 = 1024 ^ 30;
int c2 = 1024 ^ 72;
System.out.println(c1);
System.out.println(c2);
	*/
		//int i = 2;
	//	BigInteger a = new BigInteger(""+i);
	//	System.out.println(a);
		//long[] b = new long[5];
		//for(int i=0;i<5;i++)
			//b[i]=310000000*12222222222L;
		//for(int i=0;i<5;i++)
		//System.out.printf("\n%d ",b[i]);
		//long c = 1212121212121212191L;
	//	System.out.println(c);
		
		//int a = 82345;
		//int b = 3;
		//int c = (a^1024);
		//System.out.println(c);
		//int d = c^3;
		//System.out.println(d);
		//int e = d^3;
	//	System.out.println(e);
		
		
		
		/*
		 
		char a ='i';
		int s = (int) a;
		System.out.println(s);
		int x =s<<2;
		
		System.out.println(x);
		int y = x>>2;
		System.out.println(y);
		
		int[] arr = new int[10];
		int h=1;
		for(int i=0;i<10;i++){
			arr[i] = 8*h;
		h*=8;
		}
		for(int i=0;i<10;i++)
			System.out.println(arr[i]);
		
		String t="";
		int t1 = 12;
		t+=t1;
		System.out.println(t);
		File file2 = new File("text2.txt");
		try(BufferedWriter br2 = new BufferedWriter(new FileWriter(file2))){
		
			//br2.write();
					}
					catch(IOException e){
						System.out.println("Unable to read file "+file2.toString());
					}	
	*/
		
		/*
		Map<Character,Integer> map = new TreeMap<>();
		map.put('p', 5);
		map.put('k',4);
		map.put('s',9);
		map.put('d',11);
		
		int x = map.get('p');
		//System.out.println(x);
		for(Map.Entry<Character,Integer> entry : map.entrySet()){
		char key = entry.getKey();
	int	y  =  entry.getValue();
		System.out.println(key+": "+y);
		}
	}

}
*/
		import java.lang.Math;
		import java.util.Map;
		import java.util.HashMap;
		 
		public class App {
		 
		  @SuppressWarnings("boxing")
		  public static double getShannonEntropy(String s) {
		    int n = 0;
		    Map<Character, Integer> occ = new HashMap<>();
		 
		    for (int c_ = 0; c_ < s.length(); ++c_) {
		      char cx = s.charAt(c_);
		      if (occ.containsKey(cx)) {
		        occ.put(cx, occ.get(cx) + 1);
		      } else {
		        occ.put(cx, 1);
		      }
		      ++n;
		    }
		 
		    double e = 0.0;
		    for (Map.Entry<Character, Integer> entry : occ.entrySet()) {
		      char cx = entry.getKey();
		      double p = (double) entry.getValue() / n;
		      e += p * log2(p);
		    }
		    return -e;
		  }
		 
		  private static double log2(double a) {
		    return Math.log(a) / Math.log(2);
		  }
		  public static void main(String[] args) {
		    String[] sstr = {
		      "1223334444",
		      "1223334444555555555", 
		      "122333", 
		      "1227774444",
		      "aaBBcccDDDD",
		      "1234567890abcdefghijklmnopqrstuvwxyz",
		      "Rosetta Code",
		    };
		 
		    for (String ss : sstr) {
		      double entropy = App.getShannonEntropy(ss);
		      System.out.printf("Shannon entropy of %40s: %.12f%n", "\"" + ss + "\"", entropy);
		    }
		    return;
		  }
		}