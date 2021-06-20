package string_Based;

import java.util.*;
public class Sub_String
{
	public static void printSub(String st)
	{
		int n=st.length();
		int k=1;
		List<String> al = new ArrayList<>();
		List<String> list = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<=n; j++)
				al.add(st.substring(i, j));
		}
		//System.out.println(al);
		for(int i=0; i<al.size(); i++)
		{
			String str=al.get(i);
			int count=1;				
				for(int j=0; j<str.length()-1; j++)
				{
					if(str.charAt(j)+k==str.charAt(j+1))
						count+=1;
				}
			if(str.length()>1)
			{
				if(str.length()==count)
					list.add(str);
			}
			count=1;
		}
		//Collections.sort(list);
		System.out.println(list);
	}
	public static void main(String[] args) 
	{
		String str = "abbbcdeabb"; //hackerrank
		printSub(str);
	}
}
