package map_DataStructure;

import java.util.*;
public class String_Frequency
{
	public static void countFreq(String name, int n)
	{
		Map<Character, Integer> map = new HashMap<>();
		char str[]=name.toCharArray();
		for(int i=0; i<str.length; i++)
		{
			map.put(str[i], map.get(str[i])==null ? 1 : map.get(str[i])+1);
		}
		List<Integer> al = new ArrayList<>();
		for (Map.Entry<Character,Integer> entry : map.entrySet())
		{
			al.add(entry.getValue());
		}
		Collections.sort(al);
		System.out.print(getKey(map, al.get(al.size()-1))+":");
		System.out.print(al.get(al.size()-1));
	}
	
	 public static <K, V> K getKey(Map<K, V> map, V value)
	    {
	        for (Map.Entry<K, V> entry: map.entrySet())
	        {
	            if (value.equals(entry.getValue())) {
	                return entry.getKey();
	            }
	        }
	        return null;
	    }
	public static void main(String[] args) 
	{
		String name = "imranansari";
		int n=name.length();
		countFreq(name, n);
	}

}
