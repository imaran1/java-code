package stringAlgo;

import java.util.*;
public class All_Sub 
{
	static List<String> subSequence = new ArrayList<>();
	static List<String> subString = new ArrayList<>();
	static void subSequence(String st, String ans)
	{
		 if(st.length()==0)
		 {
			 subSequence .add(ans);
			 return;
		 }
		 subSequence(st.substring(1), ans+st.charAt(0));
		 subSequence(st.substring(1), ans);
	}
	public static void main(String[] args)
	{
		String st = "abc";
		All_Sub.subSequence(st, "");
		System.out.println(subSequence);
		subString(st);
		System.out.println(subString);
	}
	
	static void subString(String st)
	{
		int n=st.length();
		for(int i=0; i<n; i++)
			for(int j=i+1; j<=n; j++)
			{
				subString.add(st.substring(i,j));
			}
	}
}
