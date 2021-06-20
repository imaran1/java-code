package exception_Prac;

import java.io.File;
class ThrowException
{
	public void throwExe()
	{
//		try 
//		{
//			throw new FileNotFoundException("Exception is possible..");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
	}
}
public class Prac3 
{
	public static void main(String[] args)
	{
		ThrowException te = new ThrowException();
		te.throwExe();
		File f = new File("abc.txt");
		System.out.println("hell");
	}
}
