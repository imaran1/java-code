package practice;

public class StaticMean {
	static int a=10;
	int b = 20;
	final double d = 285.234;
	static void staticMethod() {
		a=30;
		System.out.println("static variable int a: "+a);
		//System.out.println("Instance variable int a: "+b); // C.Error
		// static method cant't call local or instance variable
	}
	static void staticMethod(int f) {
		f=30;
		System.out.println("static variable int a: "+a);
		//System.out.println("Instance variable int a: "+b); // C.Error
		// static method cant't call local or instance variable
		System.out.println("static overload Method");
	}
	
	public void instanceMethod() {
		a=40;
		b=60;
		System.out.println("static variable int a: "+a);
		System.out.println("Instance variable int a: "+b);
		// instance method can call satic or instance variable
	}
	
	public final void finalMethod() {
		System.out.println("final method");
	}
	public final void finalMethod(int v) {
		System.out.println("final overload method");
	}
	
	public static void main(String[] args) {
       StaticMean ll = new StaticMean();
       StaticMean.staticMethod();
       ll.instanceMethod();
       StaticMean.staticMethod(2);
       ll.finalMethod();
       ll.finalMethod(3);
       
	}
	
	private void dinga() {
		
	}

}
