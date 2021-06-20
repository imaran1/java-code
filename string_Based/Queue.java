package string_Based;

import java.util.*;
public class Queue 
{
	public static int[] delNode(int arr[], int n, int k)
	{
		List<Integer> al = new ArrayList<>();
		for(int i=0; i<n; i++)
			if(arr[i] != k) al.add(arr[i]);
		int resArr[]= new int[al.size()];
		int j=0;
		for(Integer i: al)
			resArr[j++]=i;
		return resArr;  //int[] arr = al.stream().mapToInt(i -> i).toArray();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter...");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i=0;
		while(n-->0)
		{
			arr[i]=sc.nextInt();
			i++;
		}
		int k=sc.nextInt();
		//delNode(arr, arr.length, k);
		for(int a: delNode(arr, arr.length, k))
			System.out.print(a+" ");
	}
}
