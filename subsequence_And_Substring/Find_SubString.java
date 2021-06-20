package subsequence_And_Substring;

import java.util.*;
public class Find_SubString 
{
	static List<String> ls= new ArrayList<>();
	static List<String> al= new ArrayList<>();
	public static void findSub(String st,String ans)
	{
		if(st.length()==0)
		{
			al.add(ans);
			return;
		}
		findSub(st.substring(1), ans+st.charAt(0));
		findSub(st.substring(1), ans);
	}
	public static void main(String[] args) 
	{
		String st="abc";
		int n=st.length();
		
		for(int i=0; i<n; i++)
			for(int j=i+1; j<=n; j++)
				ls.add(st.substring(i, j));
		System.out.println(ls);
		findSub(st, "");
		System.out.println(al);
	}
}
