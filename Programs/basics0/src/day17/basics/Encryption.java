package day17.basics;
import java.util.Scanner;
import java.util.Random;
public class Encryption {

	
public static void makeStrings(int a, String ad)
{
	String aq="";
	String aw="";
	Random R = new Random();
	int g =(int) a/2;
	char temp;
	for(int i=0;i<g;i++)
	{
		temp=ad.charAt(i);
        aq+=temp;

	}
	for(int i=g;i<a;i++)
	{
		temp=ad.charAt(i);
		aw+=temp;
		
	}
	//System.out.println(aq);
	//System.out.println(aw);
	Encrypt(aq,aw,a);

}
	public static void Encrypt(String aq,String aw,int a)

{
		int y=a/2;
		String af="";
		String ag="";
	Random R = new Random();
	int h = 1+R.nextInt(y-2);
	boolean t = true;
	int k=0;
	while(t)
	{

	k= R.nextInt(y);
	if(k>h)
		t=false;
	}
	//System.out.println(h);
	//System.out.println(k);
	char temp;
	for(int i=0;i<h;i++)
	{
		temp=aq.charAt(i);

		
	af+=temp;
      
	
	}
	for(int i=h;i<k;i++)
	{
		temp=aw.charAt(i);

		
		af+=temp;
		
		
	}
	for(int i=k;i<y;i++)
	{
		temp=aq.charAt(i);
		af+=temp;
		
	}
	for(int i=0;i<h;i++)
	{
		temp=aw.charAt(i);

		
	ag+=temp;
      
	
	}
	for(int i=h;i<k;i++)
	{
		temp=aq.charAt(i);

		
		ag+=temp;
		
		
	}
	for(int i=k;i<=y;i++)
	{
		temp=aw.charAt(i);
		ag+=temp;
		
	}
	//System.out.println(af);
	//System.out.println(ag);
	String oi="";
	String ol="";
	for(int i=0;i<af.length();i++)
	{
		temp=af.charAt(i);
		temp*=2;
		oi+=temp;
		//System.out.print(temp);
	}
	System.out.println();
	for(int i=0;i<ag.length();i++)
	{
		temp=ag.charAt(i);
		temp+=2;
		ol+=temp;
		//System.out.print(temp);
	}
	String er="";
	for(int i=0;i<y;i++)
	{
		temp=oi.charAt(i);
		er+=temp;
	}
	for(int i=0;i<=y;i++)
	{
		temp=ol.charAt(i);
		er+=temp;
	}
	System.out.println();
	System.out.printf("the encrypted code is: %s\n",er);
	System.out.printf("your key is %d and %d\n ",h,k);
	System.out.println("\ndo you wanna decrypt the code\n");
	System.out.println("If yes, press 1\n");
	Scanner input=new Scanner(System.in);
	int p = input.nextInt();
	if(p==1)
	{
		System.out.println("enter the first key\n");
	int x=input.nextInt();
	System.out.println("enter the second key\n");
	int b=input.nextInt();
	
	h=x;
	k=b;
	}
Decrypt(af,ag,h,k,y);
}
public static void Decrypt(String af,String ag,int h, int k,int y)
{
	String hj="";
	String hk="";
	char temp;
	for(int i=0;i<af.length();i++)
	{
		temp=af.charAt(i);
		temp/=2;
		//System.out.print(temp);
	}
	System.out.println();
	for(int i=0;i<af.length();i++)
	{
		temp=ag.charAt(i);
		temp-=2;
		//System.out.print(temp);
	}
	
	System.out.println();
	
	for(int i=0;i<h;i++)
	{
		temp=af.charAt(i);

		
	hj+=temp;
      
	
	}
	for(int i=h;i<k;i++)
	{
		temp=ag.charAt(i);

		
		hj+=temp;
		
		
	}
	for(int i=k;i<y;i++)
	{
		temp=af.charAt(i);
		hj+=temp;
		
	}
	for(int i=0;i<h;i++)
	{
		temp=ag.charAt(i);

		
	hk+=temp;
      
	
	}
	for(int i=h;i<k;i++)
	{
		temp=af.charAt(i);

		
		hk+=temp;
		
		
	}
	for(int i=k;i<=y;i++)
	{
		temp=ag.charAt(i);
		hk+=temp;
		
	}
	//System.out.println(hj);
	//System.out.println(hk);
	String fl="";
	for(int i=0;i<y;i++)
	{
		temp=hj.charAt(i);
		fl+=temp;
	}
	for(int i=0;i<=y;i++)
	{
		temp=hk.charAt(i);
		fl+=temp;
	}
	System.out.printf("the decrypted code is: %s\n",fl);

}
	public static void main(String[] args) {
	int a;
		Scanner keyboard = new Scanner(System.in);
	System.out.println("enter a string");
		String as = keyboard.nextLine();
			a=as.length();
			//System.out.println(a);
			makeStrings(a,as);
//Encrypt(as);
//Decrypt(ad);
	}

}
