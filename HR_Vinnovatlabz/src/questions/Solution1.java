package questions;

/*    
Question 1: 
------------
Steve has a string, consisting of lowercase English alphabetic letters.
In one  operation, he can delete any pair of adjacent letters with same value. 
For  example, string "aabcc" would become either "aab" or "bcc" after operation. 
Steve wants to reduce as much as possible.
To do this, he will repeat the above operation as many times as it can be performed. 
Help Steve out by finding and  printing 's non-reducible form! 

Note: If the final string is empty, print Empty String .

Input Format 
A single string, . 
Constraints 
 1<=n<=100 
Output Format 
If the final string is empty, print Empty String; otherwise, print the final non reducible string. 
Sample Input 0 
aaabccddd 
Sample Output 0 
abd 
Sample Case 0 
Steve can perform the following sequence of operations to get the final string:
1. aaabccddd → abccddd 
2. abccddd → abddd 
3. abddd → abd 
Thus, we print abd. 
Sample Input 1 
baab 
Sample Output 1 
Empty String 
Explanation 1 
Steve can perform the following sequence of operations to get the final string: 
1. baab → bb 
2. bb → Empty String 
Thus, we print Empty String. 
Sample Input 2 
aa 
Sample Output 2 
Empty String 
Explanation 2 
Steve can perform the following sequence of operations to get the final string: 
1. aa → Empty String 
Thus, we print Empty String.
* */

import java.util.*;
public class Solution1 
{
	static String removeDuplicate(String st)
	{
		int i=0, n=st.length();
		
		char res[]=st.toCharArray();
		Arrays.sort(res);
		for(int j=0; j<n; j++, i++)
		{
			res[i]=res[j];
			if(i>0 && res[i-1]==res[i])
				i-=2;
		} 
		String re = new String(res, 0, i);
		return re;
	}
	public static void main(String[] args)
	{
			String st="baab";
			String str="";
			//System.out.println(removeDuplicate(st));
			removDup(st);
	}
	
	public static void removDup(String st)
	{
	    StringBuilder sb = new StringBuilder(st);

	    for (int i = sb.length() - 2; i >= 0; i--) 
	        for (int j = i + 1; j < sb.length(); j++) 
	            if (sb.charAt(i) == sb.charAt(j)) 
	            {
	                sb.deleteCharAt(j);
	                sb.deleteCharAt(i);
	                break;
	            }

	    System.out.println(sb);
		
	}
} 