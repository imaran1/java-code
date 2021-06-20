package exception_Prac;

class CustomeExec extends Exception
{
	CustomeExec() 
	{
		super();
	}
	void funMethod(String st) throws CustomeExec
	{
		if(st == null)
			throw new CustomeExec();
		else System.out.println(st);
	}
}

public class Prac2 
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("Imran");
		CustomeExec ce = new CustomeExec();
		ce.funMethod("Imr");
	}
}
