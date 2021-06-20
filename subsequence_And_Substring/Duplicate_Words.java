package subsequence_And_Substring;

import java.util.*;
public class Duplicate_Words 
{
	public static void findDuplicate(String stArr[])
	{
		int len=stArr.length;
		Map<String, Integer> map = new TreeMap<>();
		for(int i=0; i<len; i++)
			map.put(stArr[i], map.getOrDefault(stArr[i], 0)+1);
		System.out.println(map);

	}
	public static void main(String[] args)
	{
		String stArr[]= {"ab","ba","ca","ab","ca","ba","ab","ab","ba","ca","ab"};
		findDuplicate(stArr);
	}
}
