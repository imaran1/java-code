package string_Based;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Password {
	
	public static void solve(String str[]) {
		int sLength=0;
		String s="";
		for(int i=0; i<str.length; i++)
		{
			String temp="";
			char ch[]=str[i].toCharArray(); // [abc,def,feg,cba]
			for(int j=ch.length-1; j>=0; j--) 
			{
				temp+=ch[j];
			}
			for(int k=0; k<str.length; k++)
			{
				if(str[k].equals(temp))
				{
					s=temp;
					sLength=s.length();
				}
					
			}
			
		}
		char ch[] = s.toCharArray();
		int l =ch.length/2;
		
		System.out.println(sLength+" "+ch[l]);
		
	}
	    public static void main(String args[] ) throws Exception 
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter: ");
	        int n=Integer.parseInt(br.readLine());
	        String str[]=new String[n];
	        for(int i=0; i<n; i++)
	           str[i]=br.readLine();
	        solve(str);
	 }
}
