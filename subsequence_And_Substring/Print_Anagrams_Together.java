package subsequence_And_Substring;

import java.util.*;
public class Print_Anagrams_Together 
{
	static Set<String> part = new HashSet<>();
    public static List<List<String>> Anagrams(String[] string_list) 
    {
    	List<String> temp = new ArrayList<>();
    	List<List<String>> res = new ArrayList<>();
    	for(int i=0; i<string_list.length; i++)
    	{
    		String st=string_list[i];
    		permut(st, "");
    	}
    	
    	for(String s: part)
    		for(int i=0; i<string_list.length; i++)
    			if(s.equals(string_list[i])) 
    				temp.add(string_list[i]);
    	res.add(temp);
    	return res;
    }
    static void permut(String st, String ans)
    {
    	if(st.length()==0) part.add(ans);
    	for(int i=0; i<st.length(); i++)
    	{
    		char ch=st.charAt(i);
    		String ros = st.substring(0, i) + st.substring(i+1);
    		permut(ros, ans + ch);
    	}
    }
    
    // Driver Code
	public static void main(String[] args) 
	{
		String st[]= { "god", "dog","act", "cat", "tac"};
	    System.out.println(	Anagrams(st));
//		String s ="abc";
//		System.out.println(s.substring(0, 1));
//		System.out.println(s.substring(0+1));
	}
}
