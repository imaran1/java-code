package arrays_Based;

import java.util.*;
public class InputTake {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		int n=sc.nextInt();
		int s=sc.nextInt();
		int i=0;
		int arr[]=new int[n];
		while(n-->0) 
		{
			arr[i++]=sc.nextInt();
			
		}
		System.out.println(s);
		for(int j: arr)
			System.out.print(j+ " ");
		System.out.println();
	}

}
