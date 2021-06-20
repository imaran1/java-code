package string_Based;

import java.util.*;
public class TestSolution {

	public static void main(String[] args) 
	{ 
		// First
		String s1="abb";
		String s2="bab";
		int s1sum=0;
		int s2sum=0;
		for(int i=0; i<s1.length(); i++)
			s1sum+=s1.charAt(i);
		
		for(int i=0; i<s1.length(); i++)
			s2sum+=s2.charAt(i);
		if(s1sum==s2sum)
			System.out.println("String is Re-Arrange");
		else
			System.out.println("String is not Re-Arrange");
		
		
		// Second
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch1);
		String news1 = String.valueOf(ch1);
		char ch2[]=s2.toCharArray();
		Arrays.sort(ch2);
		String news2 = String.valueOf(ch2);
		if(news1.equals(news2))
			System.out.println("String is Re-Arrange");
		else
			System.out.println("String is not Re-Arrange");
		
		//Third
		int a=1;
		int b=1;
		int arrs1Sum=0;
		int arrs2Sum=0;
		int arrs1[]=new int[s1.length()];
		int arrs2[]=new int[s2.length()];
		arrs1[0]=(Character.valueOf(s1.charAt(0))).compareTo(s1.charAt(s1.length()-1));
		arrs2[0]=(Character.valueOf(s2.charAt(0))).compareTo(s2.charAt(s2.length()-1));
		
       for(int i=0; i<s1.length()-1; i++)
    	   arrs1[a++]=(Character.valueOf(s1.charAt(i))).compareTo(s1.charAt(i+1));
       for(int i=0; i<s2.length()-1; i++)
    	   arrs2[b++]=(Character.valueOf(s2.charAt(i))).compareTo(s2.charAt(i+1));
       
       for(int i=0; i<arrs1.length; i++)
    	   arrs1Sum+=arrs1[i];
       for(int i=0; i<arrs1.length; i++)
    	   arrs2Sum+=arrs1[i];
		if(arrs1Sum==arrs2Sum)
			System.out.println("String is Re-Arrange");
		else
			System.out.println("String is not Re-Arrange");
       
	}
}
