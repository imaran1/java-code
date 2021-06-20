package exception_P;

public class Try_Finally 
{

	public static void main(String[] args)
	{
		System.out.println("Hello");
		try 
		{
			int a=2/0;
			System.out.println("World !");
		}

		 finally
		 {
			 System.out.println("I am Imran");
		 }
	}
}
