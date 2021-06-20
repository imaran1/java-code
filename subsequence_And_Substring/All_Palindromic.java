package subsequence_And_Substring;

import java.util.*;
import java.util.regex.Pattern;
public class All_Palindromic 
{
	static List<String> partition = new ArrayList<>();
    static void allPalindromicPerms(String st) 
    {
        int n=st.length();
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> all = new ArrayList<>();
        findCombinations(st, 0, "");
        System.out.println(partition);
        for(int i=0; i<partition.size(); i++)
        {
        	String s=partition.get(i);
        	int len=s.length()-1;
        	boolean flag=true;
        	for(int j=0; j<len; j++, len--)
        		if(s.charAt(j)!=s.charAt(len)) flag=false;
        	if(flag) all.add(s);
        }
        res.add(all);
        System.out.println(res);
    }
    
    // Driver Code
	public static void main(String[] args) 
	{
		String st="wwwzz";
		allPalindromicPerms(st);
		//System.out.println(partition);
	}
	
	static void findCombinations(String str, int index, String out)
	{
		
		if (index == str.length())
			System.out.println(out);
		for (int i = index; i < str.length(); i++)
			findCombinations(str, i + 1, out+str.substring(index, i+1) );
	}
}
