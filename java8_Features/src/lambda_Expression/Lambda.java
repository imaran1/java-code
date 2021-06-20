package lambda_Expression;

interface MathOperation{
	
	int operation(int a, int b);
	
	default void defaultMethod() {
		MathOperation fif = null;
		System.out.println(fif.operation(10, 20));
	}
	
	public static void staticMethod() {
		System.out.println("This is static method within Interface");
	}
}

public class Lambda {
	
	public static int operate(int a, int b, MathOperation mathoperation ) {
		return mathoperation.operation(a,b);
	}
	
	public static void main(String[] args) {
		MathOperation addition, subtraction, multiplication, division;
		addition=(int x, int y) -> x+y;
		subtraction=(int x, int y) -> x-y;
		multiplication=(int x, int y) -> x*y;
		division=(int x, int y) -> x/y;
	    System.out.println("Addition: "+Lambda.operate(20,10,addition));
	    System.out.println("Subtraction: "+Lambda.operate(20,10,subtraction));
	    System.out.println("Multiplication: "+Lambda.operate(20,10,multiplication));
	    System.out.println("Division: "+Lambda.operate(20,10,division));
	    MathOperation.staticMethod();
	}
}
