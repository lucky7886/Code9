package FrameworkLevel1;

public class App {
	static String methodName;
	public static void main(String[] args) {
		
		
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		System.out.println(methodName);
		
		App a1 = new App();
		a1.m1();

	}
	
	public void m1() {
        methodName = Thread.currentThread().getStackTrace()[1].getClassName();
		
		System.out.println(methodName);
	}

}
