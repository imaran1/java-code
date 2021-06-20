package exception_Prac;

class MyClass
{
	public String test()
	{
		try
		{
			System.out.println("One");
			return "Noor";
		}
		finally
		{
			System.out.println("Two");
		}
	}
}
public class Prac6 
{
	public static void main(String[] args) 
	{
		MyClass mc = new MyClass();
		mc.test();
	}
}
