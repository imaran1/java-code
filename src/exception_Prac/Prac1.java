package exception_Prac;

public class Prac1{

		public static void fun(int a, int b) {
			try{
				throw new ArithmeticException("You cant divide by 0");
			}
			catch(Exception e) {
				System.out.println("Exception");
				System.out.println(a+b);
			}
			finally {
				System.out.println(a*b);
			}

		}

	
	public static void main(String[] args)throws Exception 
	{
		fun(10,0);
	}

}
