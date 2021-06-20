package exception_P;

import java.util.Scanner;

class InvalidAgeExcepiton extends RuntimeException
{
	public InvalidAgeExcepiton(String str)
	{
		super(str);
	}
	public void fun()
	{
		System.out.println("Imran Ansari");
	}
}

public class RunTime_Exception
{ 
	static void status(int age)
	{
		if (age>25)
		{
			System.out.println("eligible for mrg");
			}
		else
		{//useing user created Exception
			throw new InvalidAgeExcepiton("not eligible for mrg");
			}
	}
	
	public void fun2()
	{
		
	}
	public static void main(String[] args)
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("enter u r age");//23
		int age = s.nextInt();
		RunTime_Exception.status(age);
		//InvalidAgeExcepiton in = new InvalidAgeExcepiton("Imran");
		//in.fun();	
		}
	}