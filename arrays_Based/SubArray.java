package arrays_Based;

import java.util.*;
public class SubArray 
{
	static List<Integer> subArr= new ArrayList<>();
	static void printSubArrays(int []arr, int start, int end)
	{    
	    if (end == arr.length)
	        return;
	    else if (start > end)
	        printSubArrays(arr, 0, end + 1);
	    else
	    {
	        System.out.print("[");
	        for (int i = start; i < end; i++){
	            subArr.add(arr[i]);
	        }
	         
	        System.out.println(arr[end]+"]");
	        printSubArrays(arr, start + 1, end);
	    }
	     
	    return;
	}
	public static void main(String[] args) 
	{
		int arr[]= {-1,-2,-3,-4};
	}
}
