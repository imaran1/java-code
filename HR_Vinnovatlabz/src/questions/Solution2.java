package questions;

/*
 * Q2) Bob has an array consisting of positive and negative numbers. The task Bob has in hand is to sort the array in lipending order.

Bob knows that an array is in lipending order if
1) The positive numbers and negative numbers sorting do not interfere with each other. For eg, array [9,2,-1] will become [2,-1,9]and not [-1,2,9] as positive and negative should be alternate and sorting sequence of positive numbers and do not interfere with sorting sequence of negative numbers.

2) The positive and negative numbers are always placed alternate to each other.

3) The lipending order array always start with a positive number

4) The input array has atleast 1 positive and 1 negative integer

Input Format: An array of positive and negative integers
Output Format: An array of integers sorted in lipending order

Sample Input: [2,6,-8,-4,4,-1]  
            Output : [2,-8,4,-4,6,-1]
 */
import java.util.*;
public class Solution2 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,6,-8,-4,4,-1};
		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		int n=arr.length;
		for(int i=0; i<n; i++)
		{
			if(arr[i]>=0) pos.add(arr[i]);
			else neg.add(arr[i]);
		}   
		Collections.sort(pos);
		for(int i=0,j=0; i<pos.size() || j<neg.size(); i++, j++)
		{
			res.add(pos.get(i));
			res.add(neg.get(j));
		}
		System.out.println(res);
	}
}

