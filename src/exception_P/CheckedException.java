package exception_P;

import java.util.*;
class InvalidAgeExcepiton extends Exception
{ 
	public InvalidAgeExcepiton(String str)
	{
		//super constructor calling inorder to print your information
		super(str);
	}
};
public class CheckedException 
{
	static void status(int age)throws InvalidAgeExcepiton
	{
		if (age>25)
		{
			System.out.println("eligible for mrg");
	     }
		else
		{ //using user created Exception
			throw new InvalidAgeExcepiton("not eligible try after some time");
		}
	}
	public static void main(String[] args)throws InvalidAgeExcepiton
	{ 
		Scanner s = new Scanner(System.in);
		System.out.println("enter u r age");
		int age = s.nextInt();
		CheckedException.status(age);
		}
}
