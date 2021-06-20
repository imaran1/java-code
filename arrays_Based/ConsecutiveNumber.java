package arrays_Based;

import java.util.*;

public class ConsecutiveNumber {
	
	public static void findNumber(int n) {
		
		int a=0;
		for(int i=2; i<n; i++) {
			   a=n%i;
			if(a*(a+1)==n) {
				System.out.println(a+" "+(a+1));
				break;
			}
				
		}

		
	}
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Any Number > 9:");
//		int n = sc.nextInt();
		System.out.println("Hello!");
		ConsecutiveNumber.findNumber(10100);
	}

}
