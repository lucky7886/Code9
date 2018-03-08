class A1
{
     
}
 
class B1 extends A1
{
     
}
 
class C1 extends B1
{
     
}
 
public class MainClass1 
{
    static void overloadedMethod(A1 a)
    {
        System.out.println("ONE");
    }
     
    static void overloadedMethod(B1 b)
    {
        System.out.println("TWO");
    }
     
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
    
    static void overloadedMethod(C1 c)
    {
        System.out.println("FOUR");
    }
     
    public static void main(String[] args)
    {
        B1 c = new C1();
         
        overloadedMethod(c);
    }
}