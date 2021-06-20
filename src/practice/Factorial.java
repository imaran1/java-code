package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter: ");
		long n=sc.nextInt();
		System.out.println(fact(n));
	}

	public static long fact(long n) {
		if (n==1) 
			return 2;
		else
			return n*fact(n-1);
	}

}
