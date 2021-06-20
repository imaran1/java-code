package exception_Prac;

class Person2 
{
	public void talk() {}
}

public class Prac5 {

	public static void main(String[] args) 
	{
	   Person2 p=null;
	   try
	   {
		   p.talk();
	   }
	   catch(NullPointerException ne)
	   {
		   System.out.println("There is a NullPointerException");
	   }
	   catch(Exception e)
	   {
		   System.out.println("There is an Exception");
	   }
	   System.out.println("Everything went fine !");
	}
}
