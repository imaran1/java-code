 package questions;

/*
 *   Question 3: 
     Given an array of integers, sort the array according to frequency of elements.
     If frequencies of two elements are same, print them in increasing order.
     
     =Input : arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12} 
      Output : 3 3 3 3 2 2 2 12 12 4 5 
      Explanation : 
      No. Freq 
      2 : 3 
      3 : 4 
      4 : 1 
      5 : 1 
      12 : 2
 */

import java.util.*;
public class Solution3 
{
	public static int[] frequencySort(int[] arr)
	{
		Map<Integer, Integer> map = new HashMap<>();
		
		Arrays.stream(arr).forEach(n -> map.put(n, map.getOrDefault(n, 0)+1));
		
		return Arrays.stream(arr).boxed().sorted((a,b) -> map.get(a) != map.get(b) ? 
				map.get(b) - map.get(a) : a-b).mapToInt(n -> n).toArray();
	}

	public static void main(String[] args) 
	{
		int arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
		int n=arr.length;
		arr=frequencySort(arr);
		for(int a: arr) System.out.print(a+" ");
		System.out.println();
		frequencySort(arr, n);
		for(int a: arr) System.out.print(a+" ");
		
	}
	
	public static int [] frequencySort(int[] arr, int n)
	{
		Map<Integer, Integer> map = new LinkedHashMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		Arrays.stream(arr).forEach(i -> map.put(i, map.getOrDefault(i, 0)+1));
		for(Map.Entry<Integer, Integer> entry: map.entrySet())
		{
			int a=entry.getKey();
			int b=entry.getValue();
			for(int i=0; i<b; i++)
				al.add(a);
		}
		int[] ar = al.stream().mapToInt(i -> i).toArray();
		return ar;
	}
}
