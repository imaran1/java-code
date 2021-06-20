package date_Time;

import java.util.*;
import java.time.*;
public class Leapyear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int n = sc.nextInt();
		Year y = Year.of(n);
		if(y.isLeap())
		{
			System.out.printf("%d is Leap year",n);
		}else
		{
			System.out.printf("%d is not Leap year",n);
		}
	}
	
}
