package subsequence_And_Substring;

import java.util.*;
public class Sub_Array 
{
	static List<List<Integer>> subArr=new ArrayList<>();
	
	static void subArray(int[] arr, int n)
	{
		List<Integer> temp;
		for(int i=0; i<n; i++)
			for(int j=i; j<n; j++)
			{
				temp=new ArrayList<>();
				for(int k=i; k<=j; k++)
					 temp.add(arr[k]);
				subArr.add(temp);
			}
	}
	public static void main(String[] args)
	{
		int[] arr= {-3, 2, 3, 1, 6};
		int n=arr.length;
		Arrays.sort(arr);
		subArray(arr,n);
		System.out.println(subArr);
		subArrayExists(subArr);
		System.out.println(subArrayExists(subArr));
	}
	
	static boolean subArrayExists(List<List<Integer>> subArr)
	{
		List<Integer> a;
		boolean flag=false;
		int sum=0;
		for(int i=0; i<subArr.size(); i++)
		{
			a=subArr.get(i);
			for(int j=0; j<a.size(); j++)
			{
				sum+=a.get(j);
				if(sum==0) flag=true;
			}
			sum=0;
		}
		if(flag) return true;
		else return false;
	}
}
