package string_Based;

import java.util.*;
public class Reverse_Vowel 
{
	public static String reverseV(String st)
	{
		char ch[]= {'a','e','i','o','u'};
		char str[]=st.toCharArray();
		int n=st.length();
		List<Integer> al = new ArrayList<>();
		for(int i=0; i<n; i++)
			for(int j=0; j<ch.length; j++)
				if(ch[j]==str[i]) al.add(i);
		
		for(int i=al.size()-1, j=0; i>=0 && j<al.size()-1; i--, j++)
		{
			int a=al.get(j);
			int b=al.get(i);
			char temp = str[a];
			str[a]=str[b];
			str[b]=temp;
		}
		String s=String.valueOf(str);
		return s;
	}
	public static void main(String[] args) 
	{
		String str = "hello-world";
		System.out.println(reverseV(str));
	}
}
