package string_Based;

import java.util.*;
public class Merge_Two_Sorted_Array
{
	static void merge(int arr1[], int m, int arr2[],int n)
	{
		for (int i=n-1; i>=0; i--)
		{
			int j, last = arr1[m-1];
			for (j=m-2; j >= 0 && arr1[j] > arr2[i]; j--)
				arr1[j+1] = arr1[j];
			if (j != m-2 || last > arr2[i])
			{
				arr1[j+1] = arr2[i];
				arr2[i] = last;
			}
		}
	}
	public static void main(String[] args) 
	{
		 int arr1[] = new int[]{1,3,5,7};
		 int arr2[] = new int[]{0,2,6,8,9};
		 merge(arr1, arr1.length, arr2, arr2.length);
		System.out.print("After Merging nFirst Array: ");
		System.out.println(Arrays.toString(arr1));
		System.out.print("Second Array: ");
		System.out.println(Arrays.toString(arr2));
	}
}
