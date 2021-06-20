package string_Based;

import java.util.*;

public class Reverse_Word 
{
	static void first_subString(String s)
	{
		int n = s.length(), c = 0;
		String s1, s2;
		HashMap<String, Integer> mpp = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == '#')
			{
				s1 = s.substring(c, i);
				System.out.println(s1);
				mpp.put(s1, 1);
				c = i + 1;
			}
		}
		for (int i = 0; i < n; i++)
		{
			if (s.charAt(i) == ' ')
			{
				continue;
			}
			for (int j = 0; j < n; j++)
			{
				if (s.charAt(i) == ' ')
				{
					break;
				}
				s1 = s.substring(i, j - i + 1);
				s2 = s1;
				s1 = reverse(s1);
				if (mpp.containsKey(s1))
				{
					System.out.println(s2);//return s2;
				}
			}
		}
	}
		
		static String reverse(String input)
		{
			char[] a = input.toCharArray();
			int l, r = a.length - 1;
			for (l = 0; l < r; l++, r--)
			{
				char temp = a[l];
				a[l] = a[r];
				a[r] = temp;
			}
			return String.valueOf(a);
		}
		
		public static void main(String[] args)
		{
			String s, s1;
			s = "mango is sweet when nam en tastes it#";
			first_subString(s);
			//System.out.print(s1+ "\n");
		}

}
