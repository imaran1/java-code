package subsequence_And_Substring;

import java.util.*;
public class All_Partitions_Of_String 
{
	static List<List<String>> partitions = new ArrayList<>();
	static List<String> partition = new ArrayList<>();

	static void recurse(int size, String str) 
	{
	    if (str.length() <= size)
	    {
	        return;
	    }
	    partition.add(str.substring(0, size));
	    for (int i = 1; i < str.length(); i++) 
	    {
	        if (size < str.length())
	            recurse(i, str.substring(size));
	    }
	    partitions.add(partition);
	}
	public static void main(String[] args) 
	{
		String st = "wwwzz";
		int size=0;
		recurse(size, st); 
		System.out.println(partitions);
	}
}
