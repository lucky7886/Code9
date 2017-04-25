package day11.basics;
public class VarArgs {

	public static void main(String[] args) {
double d1 = 10.0;
double d2 = 20.0;
double d3 = 30.0;
double d4 = 40.0;
System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n",d1,d2,d3,d4);
System.out.printf("average of d1 and d2 is: %.1f\n",variableArgs(d1,d2));
System.out.printf("average of d1, d2 and d3 is: %.1f\n",variableArgs(d1,d2,d3));
System.out.printf("average of d1, d2, d3 and d4 is: %.1f\n",variableArgs(d1,d2,d3,d4));
	}
public static double variableArgs(double... d5)
{
	double tot=0;
	for(double name:d5)
		tot+=name;
	return tot/d5.length;
}
}
