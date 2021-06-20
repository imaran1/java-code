package subsequence_And_Substring;

import java.util.*;
public class Pair 
{   
	public boolean sulution(int A[])
	{
		Arrays.sort(A);
		int len=A.length;
		boolean flag=false;
		int i=0;
		int j=1;
		for(; i<len-1 && j<len; i++, j++)
			if(A[j]-A[i]==1) flag=true;
		return flag;
	}
	public static void main(String[] args) 
	{
		int arr[]= {11,1,8,16,14};
		Pair p=new Pair();
		System.out.println(p.sulution(arr));
	}
}
