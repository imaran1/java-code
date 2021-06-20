package string_Based;

import java.util.*;
public class Sub_String_Reverse 
{
	public static void subStringReverse(String str)
	{	
		List<Character> ls = new ArrayList<>();
		char st[]=str.toCharArray();
		int n=st.length;
		char ch [] = {'a','e','i','o','u'};     // str ="edaiouekhtueoida";
		for(int i=0; i<n-1; i++)
		{
			if((st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u')
					                    &&
			  (st[i+1]=='a'||st[i+1]=='e'||st[i+1]=='i'||st[i+1]=='o'||st[i+1]=='u'))
			{
				ls.add(st[i]);
			}
//			if(i>0)
//			{
//				if(
//				    ((st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u')
//				                        &&
//		         (st[i+1]!='a'||st[i+1]!='e'||st[i+1]!='i'||st[i+1]!='o'||st[i+1]!='u'))
//		                                 &&
//		         (st[i-1]=='a'||st[i-1]=='e'||st[i-1]=='i'||st[i-1]=='o'||st[i-1]=='u'))
//				{
//					System.out.println(st[i]+"...."+st[i+1]);
//				}
//			}
		}
		System.out.println(ls);
	}
	public static void main(String[] args) 
	{
		String str ="edaiouekhtueoida"; // Output = "edeuoiakhtioeuda"
		String s = "edaiouekht";
		subStringReverse(str);
	}

}
