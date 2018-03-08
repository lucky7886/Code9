
class A
{
    int i = 10;
    void run(){
    	System.out.println("A class");
    }
}
 
class B extends A
{
    int i = 20;
    void run(){
    	System.out.println("B class");
    }
   
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        B a = new B();
 
        System.out.println(a.i);
        a.run();
    }
}