package day19.basics;

public class test {
static private int a=0;
private int b=0;

public static void main(String[] args) {
	
test t1= new test();
abc(t1);
t1.zxc();
	}
	
public static void abc(test a)
{
test.a=4;
a.b=0;
a.zxc();
}
public void zxc()
{
	a=0;
	b=0;
	test y = new test();
abc(y);
}
}
