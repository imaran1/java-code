package string_Based;

import java.util.*;
public class BigSorting 
{
	 public static void bigSorting(List<String> usort) 
	 {
		 Collections.sort(usort,new Comparator<String>() {
	            @Override
	            public int compare(String a, String b) 
	            {
	                return StringAsIntegerCompare(a,b);
	            }
	        });
	        
	        StringBuilder output = new StringBuilder("");
	        for(String num : usort)
	            output.append(num+"\n");
	        System.out.print(output+" ");
	 }
	 
	 static int StringAsIntegerCompare(String s1, String s2)
	    {
	        if(s1.length() > s2.length()) return 1;
	        if(s1.length() < s2.length()) return -1;
	        for(int i = 0; i < s1.length(); i++)
	        {
	            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
	            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
	        }
	        return 0;
	    }
	public static void main(String[] args) 
	{
		List<String> usort = new ArrayList<>();
		usort.add("6");
		usort.add("31415926535897932384626433832795");
		usort.add("1");
		usort.add("3");
		usort.add("10");
		usort.add("3");
		usort.add("5");
		System.out.println(usort);
		bigSorting(usort);
	}

}
