package string_Based;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter: ");
		int count=0;
		int n=sc.nextInt();
		List<Integer> ls=new ArrayList<>();
		while(n>0)
		{
			ls.add(n);
			n=sc.nextInt();
		}
		for(Integer i: ls) if(i<=10) count++;
		System.out.println(count);
	}
}
