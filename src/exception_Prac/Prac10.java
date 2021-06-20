package exception_Prac;

import java.io.*;

public class Prac10 
{
	static void m()
	{
		try
		{
			m();
		}
		catch(StackOverflowError e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		m();
		System.out.println("Code after exception handling");
	}
}
