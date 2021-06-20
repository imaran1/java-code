package exception_P;

class Custome_Throw extends Exception
{
	public void throwWith()
	{
		 
	}
}

public class With_Throw
{
	public static void main(String[] args) 
	{
		Custome_Throw ct = new Custome_Throw();
		System.out.println("hello");
		ct.throwWith();
	}
}
