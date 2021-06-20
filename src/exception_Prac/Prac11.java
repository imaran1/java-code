package exception_Prac;

public class Prac11 
{
	public static void main(String[] args) 
	{
		System.out.println("method return- "+ m());
	}
	
	static String m()
	{
		try
		{
			int i=10/0;
		}
		catch(ArithmeticException ae)
		{
			return "catch";
		}		
		finally
		{
			return "finally";
		}
	}
}
