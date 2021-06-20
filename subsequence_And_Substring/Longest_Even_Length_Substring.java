package subsequence_And_Substring;

import java.util.*;
import java.io.*;
public class Longest_Even_Length_Substring
{
	public static int printSub(String st)
	{
		int len=st.length();
		List<String> sub = new ArrayList<>();
		List<String> evenSub = new ArrayList<>();
		for(int i=0; i<len; i++)
			for(int j=1+i; j<=len; j++)
				sub.add(st.substring(i, j));
		for(String s: sub)
		{
			if(s.length()%2==0) evenSub.add(s);
		}
		Collections.sort(evenSub);
		//System.out.println(evenSub);
		String temp=evenSub.get(evenSub.size()-1);
		return temp.length();
	}
	public static void main(String[] args) throws IOException  
	{
		  //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter....");
		  int n=sc.nextInt();
		  //int n=br.read();
		  while(n-->0)
		  {
			  String st =sc.nextLine();
					  //br.readLine();
			  System.out.println(st);
		  }
	}
}
