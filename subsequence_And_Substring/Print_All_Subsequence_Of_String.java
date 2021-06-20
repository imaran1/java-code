package subsequence_And_Substring;

import java.util.*;
public class Print_All_Subsequence_Of_String 
{
	 List<String> sub = new ArrayList<>();
	 private void findsubsequences(String s, String ans)
	 {
		 if (s.length() == 0) 
		 {
			 //System.out.println(ans);
			 sub.add(ans);
//			 if(ans.equals("Gks"))
//			 { 
//				 System.out.println("Gks");
//			 } 
			 return;
		  }
         findsubsequences(s.substring(1), ans + s.charAt(0));//[abc, bc, c] [a,ab, abc]
         findsubsequences(s.substring(1), ans);
      }
	 
	public static void main(String[] args) 
	{
		String str = "wwwzz"; // GeeksforGeeks
		Print_All_Subsequence_Of_String p = new Print_All_Subsequence_Of_String();
		p.findsubsequences(str, ""); // Calling a function
		System.out.println(p.sub);
	}
}
