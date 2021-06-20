package string_Based;

import java.util.*;
public class Monk_And_Suffix_Sort {

	public static void main(String[] args)
	{
		String str = "aacb"; //  
		int n=4;
		int end=str.length();
		List<String> list = new ArrayList<String>();
		while(end >= 0) {
           list.add(str.substring(end--));
        }
		Collections.sort(list);
		System.out.print(list.get(n-1));
	    int arr[]= {3,1,3,2,3,2};
		Set<Integer> st = new HashSet<Integer>();
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++)
			st.add(arr[i]);
		for(Integer i: st)
			al.add(i);
		System.out.println(al.get(al.size()-1));
		
		
	}

}
