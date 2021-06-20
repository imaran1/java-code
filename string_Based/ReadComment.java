package string_Based;

import java.util.*;
public class ReadComment {

	 public static void main(String args[])
	 {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter: ");
	        String s;
	        while(sc.hasNextLine())
	        {
	            s=sc.nextLine();
	            for(int i=0;i<s.length()-1;i++)
	            {
	                if(s.charAt(i)=='/'&& s.charAt(i+1)=='/')
	                {
	                    break;
	                }
	                else if(s.contains("//"))
	                {
	                    if(s.charAt(i)=='-'&& s.charAt(i+1)=='>')
	                    {
	                        String s1=s.substring(s.indexOf("//"));
	                        s= s.substring(0,s.indexOf("//")).replace("->",".");
	                        s+=s1;
	                    }
	                }
	                else if(s.charAt(i)=='-'&&s.charAt(i+1)=='>'){
	                    s=s.replace("->",".");
	                }
	            }
	            System.out.println(s);
	        }
	   }
}
