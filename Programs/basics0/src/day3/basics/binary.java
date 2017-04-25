package day3.basics;
import java.util.Random;
import java.util.Scanner;
public class binary {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random randomNumbers=new Random();
     System.out.println("enter the number: ");
    int a=input.nextInt();
    int [] b = new int[10];
    String z="";
    String x="";
    String t="";
    String cv="";
    int [] e = new int[10];
    int [] f = new int[10];
    int c,j,i,l,n,m;
    n=randomNumbers.nextInt(a);
    m=randomNumbers.nextInt(a);
    System.out.printf("the value of parent 1 is: %d\n",n);
    System.out.printf("the value of parent 2 is: %d\n",m);
    int d=0;
    int as=0;
    c=0;
    j=0;
    i=0;
    l=0;
    input.close();
    
    
    while(n!=0)
    {
    	i++;
    	c=n%2;
    	b[i]=c;
    	n=n/2;
    }
    
    
    
    i=1;
    j=8;
    int temp;
    while(i<j)
    {
    	temp = b[i];
    	b[i] = b[j];
    	b[j] = temp;
    	i=i+1;
    	j=j-1;
    }
    
    
    for(i=1;i<=8;i++)
    	x+=b[i];
    int qw=converto(x);
    
    
    while(m!=0)
    {
    	l++;
    	j=m%2;
    	e[l]=j;
    	m=m/2;
    }
    
    
    
    i=1;
    j=8;
    
    while(i<j)
    {
    	temp = e[i];
    	e[i] = e[j];
    	e[j] = temp;
    	i=i+1;
    	j=j-1;
    }
    
    
    for(i=1;i<=8;i++)
    
    	t+=e[i];
    
    int er=converto(t);
    
    do
    {
    int h = 1+randomNumbers.nextInt(7);
    
    i=0;
    
    
    for(int y=1;y<=h;y++)
    
    
    {
    	i++;
    	f[i]=b[i];
    	
    }
    
    i=h;
    
    for(int y=8-h;y>0;y--)
    
    {
    	i++;
    	f[i]=e[i];
    }
    
    z="";
    for(i=1;i<=8;i++)
    	z+=f[i];
    
    
    d=converto(z);
    
    System.out.print("parent 1:"); 
    
    for(int v=1;v<=8;v++)
    {
    	
    	System.out.print(b[v]);
    }
    
    
    
    	System.out.println();
    
    	System.out.print("parent 2:");
    	
    	for(int v=1;v<=8;v++)
    	System.out.print(e[v]);
    
    
    System.out.println();
     
    System.out.printf("\nthe point of crossover is %d\n",h);
    
    
    
    System.out.print("offspring after crossover ");
    
    
    for(int v=1;v<=8;v++)
    System.out.print(f[v]);
    
    
    
    System.out.printf("\nthe value of offspring is: %d\n",d);
    
    
        if(d>qw & d>er)
    
    
    	System.out.println("offspring is better than the parents");
 
    
        else 
        {
    	System.out.println("crossover is not successful\n");
        System.out.println("APPLYING MUTATION...\n");
        int hy = 1 + randomNumbers.nextInt(8);
        if(f[hy]==1)
        	f[hy-1]=1;
        else
        	f[hy]=1;
        System.out.printf("after mutation at bit %d\n",hy);
        cv="";
        for(int ds=1;ds<=8;ds++)
        {  	cv+=f[ds];
        	System.out.print(f[ds]);
        }
        System.out.println();
        as=converto(cv);
        System.out.printf("the value of the new offspring is: %d\n\n",as);
        if(as>d)
        	System.out.println("mutation successful!!\n");
        else
        	System.out.println("mutation NOT successful!!");
        
        }
    }
    while(d<a & as<a);
    
    
	}
	
	
	
	public static int converto(String u)
	
	{
	
		int r = Integer.parseInt(u,2);
	
		return r;

	}
}
