package exception_Prac;

import java.io.*;
class SuperClass
{
	public int doIt(String str, Integer...data) throws Exception
	{
		String signature ="(String, Integer)";
		System.out.println(str +" "+ signature);
		return 1;
	}
}

class Child extends SuperClass
{
	public int doIt(String str, Integer...data)
	{
		String signature ="(String, Integer)";
		System.out.println("overridden "+str +" "+ signature);
		return 0;
	}
}

public class Prac7 extends SuperClass
{	
	public int doIt(String str, Integer...data)
	{
		String signature ="(String, Integer)";
		System.out.println("overridden "+str +" "+ signature);
		return 0;
	}
	
	public static void main(String[] args) throws Exception 
	{
		SuperClass sb = new Prac7();
		sb.doIt("hello", 3);
	}
}
