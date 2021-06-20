package string_Based;

import java.util.*;
public class ReArrange {

	public static void reArrange(int arr[])
	{
		int n=arr.length;
		List<Integer> al= new ArrayList<>();
		int j=n-1;
		int k=0;
		boolean flag=true;
		for(int i=0; i<n; i++)
		{
			if(flag) al.add(arr[j--]);
			else al.add(arr[k++]);
			flag=!flag;
		}
		System.out.println(al);
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6};
		reArrange(arr);
	}
}
