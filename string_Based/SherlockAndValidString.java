package string_Based;

import java.util.*;
public class SherlockAndValidString 
{
	public static String isValid(String s) 
	{
	    Map<Character, Integer> charFreqMap = new HashMap<>();
	    for (int i = 0; i < s.length(); i++) // string = abcdefghhgfedecba
	    {
	      char c = s.charAt(i);
	      int freq = charFreqMap.getOrDefault(c, 0);
	      charFreqMap.put(c, ++freq);
	    }
	    int[] arr = new int[charFreqMap.size()];
	    int idx = 0;
	    for (Map.Entry<Character, Integer> characterIntegerEntry : charFreqMap.entrySet())
	    {
	      arr[idx++] = characterIntegerEntry.getValue();
	    }
	    Arrays.sort(arr);
	    if (charFreqMap.size() == 1) return "YES";
	    int first = arr[0];
	    int second = arr[1];
	    int secondLast = arr[arr.length - 2];
	    int last = arr[arr.length - 1];
	    if (first == last) return "YES";
	    if (first == 1 && second == last) return "YES";
	    if (first == second && second == secondLast && secondLast == (last - 1)) return "YES";
	    return "NO";
	  }

	public static void main(String[] args) 
	{
		String s="abcdefghhgfedecba"; // abcdefghhgfedecba
		System.out.println(isValid(s));
		 Map<Character, Integer> charFreqMap = new HashMap<>();
		    for (int i = 0; i < s.length(); i++) 
		    {
		      char c = s.charAt(i);
		      int freq = charFreqMap.getOrDefault(c, 0);
		      charFreqMap.put(c, ++freq);
		      System.out.println(charFreqMap);
		    }
		    //System.out.println(charFreqMap);
//		    int[] arr = new int[charFreqMap.size()];
//		    int idx = 0;
//		    for (Map.Entry<Character, Integer> characterIntegerEntry : charFreqMap.entrySet())
//		    {
//		      arr[idx++] = characterIntegerEntry.getValue();
//		      System.out.println(characterIntegerEntry);
//		    }
		    //for(int i=0; i<arr.length; i++)
		    	//System.out.println(arr[i]+"");

		    
		    
	}

}
