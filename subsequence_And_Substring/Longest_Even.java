package subsequence_And_Substring;

import java.util.*;
public class Longest_Even
{
	public static String evenLongest(String s)
	{
		String st[]=s.split(" ");
		List<String> al=new ArrayList<>();
		String res="";
		int len=0;
		for(String i: st)
			if(i.length()%2==0) al.add(i);
		for(int i=0; i<al.size(); i++)
		{
			String temp=al.get(i);
			if(temp.length()>len)
				len=temp.length();
		}
		for(int i=0; i<al.size(); i++)
		{
			String temp=al.get(i);
			if(temp.length()==len)
				res=temp;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		String s="When compared with C++, Java codes are generally more maintainable because"
				+ " Java does not allow many things which may lead bad inefficient programming"
				+ " if used incorrectly";
		System.out.println(evenLongest(s));
	}
}
