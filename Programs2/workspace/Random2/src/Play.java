import java.util.Random;

public class Play {

 public static void main(String[] args) {
int p=0;
	 String separator = "";
  double[] team = new double[10];
  String[] teamString = new String[10];
  double Kohli = 11;
   double Villiers = 10.5;
   double Warner = 10.5;
   double Gayle = 9.5;
   double Dhawan = 9.5;
   double Williamson = 9;

   double Moises = 9;
   double Binny = 8;
   double Negi = 8;

  double Bhuvneshwar = 9;
  double Nehra = 8.5;
  double Rashid = 8.5;
  double Badree = 8.5;
  double Chahal = 8.5;
  double Aravind = 8;

 /* double[] Batsmen = { Kohli, Villiers, Warner, Gayle, Dhawan, Williamson };

  double[] AllRounders = { Moises, Binny, Negi };

  double[] Bowlers = { Bhuvneshwar, Nehra, Rashid, Badree, Chahal, Aravind };*/

  Random r = new Random();

  do {
   Kohli = 11;
    Villiers = 10.5;
    Warner = 10.5;
     Gayle = 9.5;
     Dhawan = 9.5;
     Williamson = 9;

    Moises = 9;
     Binny = 8;
     Negi = 8;

    Bhuvneshwar = 9;
    Nehra = 8.5;
    Rashid = 8.5;
    Badree = 8.5;
    Chahal = 8.5;
    Aravind = 8;
    
    double[] Batsmen = { Kohli, Villiers, Warner, Gayle, Dhawan, Williamson };
    String[] BatsmenString = { "Kohli", "Villiers", "Warner", "Gayle", "Dhawan", "Williamson" };
    
    double[] AllRounders = { Moises, Binny, Negi };
    String[] AllRoundersString = { "Moises", "Binny", "Negi" };
    
    double[] Bowlers = { Bhuvneshwar, Nehra, Rashid, Badree, Chahal, Aravind };
    String[] BowlersString = { "Bhuvneshwar", "Nehra", "Rashid", "Badree", "Chahal", "Aravind" };

   int bowl = 0;
   int bat = 0;
   int all = 0;

   while (bowl + bat + all != 10) {
    bowl = 3 + r.nextInt(3);
    bat = 2 + r.nextInt(4);
    all = 1 + r.nextInt(3);
   }

 /*  System.out.println(bowl);
   System.out.println(bat);
   System.out.println(all);*/

   for (int i = 0; i < bowl; i++) {

    int m = r.nextInt(6);
  
    int sum = 0;
    for (int l = 0; l < Bowlers.length; l++)
     sum += Bowlers[l];

    if (sum == 0)
     break;
    if (Bowlers[m] != 0) {
     
    
     team[i]=Bowlers[m];
     teamString[i] = BowlersString[m];
     Bowlers[m] = 0;
    } else
     i--;
   }

   for (int j = bowl; j < bowl + bat; j++) {
    int m = r.nextInt(6);
    int sum = 0;
    for (int i = 0; i < Batsmen.length; i++)
     sum += Batsmen[i];
    if (sum == 0)
     break;
    if (Batsmen[m] != 0) {
     team[j] = Batsmen[m];
     teamString[j] = BatsmenString[m];
     Batsmen[m] = 0;
    } else
     j--;

   }
   for (int k = bowl + bat; k < bowl + bat + all; k++) {
    int m = r.nextInt(3);
    int sum = 0;
    for (int i = 0; i < AllRounders.length; i++)
     sum += AllRounders[i];
    if (sum == 0)
     break;
    if (AllRounders[m] != 0) {
     team[k] = AllRounders[m];
     teamString[k] = AllRoundersString[m];
     AllRounders[m] = 0;
    } else
     k--;
   }
   int sum = 0;

   for (int i = 0; i < 10; i++)
    sum += team[i];
   
   String separator2 = "";
   for (int i = 0; i < 10; i++){
	     separator2+=teamString[i];
   
   }
   
   if (sum <= 100) {
	   if(!separator.contains(separator2)){
    for (int i = 0; i < 10; i++){
     System.out.print(teamString[i] + " ");
   separator+=teamString[i];
    }
    separator+=" ";
	   }
    }
   
  
  p++;
   
   System.out.println();

  } while (true);
//System.out.println(separator);
 }

}
