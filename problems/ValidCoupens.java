 package problems;

import java.util.*;

public class ValidCoupens {
	
	public static void validCoupen(List<String> serialNumber) 
	{
		for(int i=0; i<serialNumber.size(); i++)
		{
			int count=0;
			String st = serialNumber.get(i);
			String arr[]= {"10","20","50","100","500","1000"};	
			 // For first 3 character
			outerLoop:
			for(int j=0; j<3; j++)
			{
				if(st.length()>=10 && st.length() <=12)
					if(j<3)
					{
						char ch=st.charAt(j);
						if(st.charAt(j)!=st.charAt(j+1))
						{
							for(int k=65; k<=90; k++)
								if(k==ch) count+=1;
							for(int k=97; k<=122; k++)
								if(k==ch) break outerLoop;   
						}
						else break outerLoop;
					}
			}
			//System.out.println(count);
			
			// For year
			if(st.length()>=10 && st.length()<=12)
			{
				 String s1=st.substring(3, 7);
				 for(int m=1900; m<=2019; m++)
				 {
					 String s2 = String.valueOf(m);
					 if(s1.equals(s2)) count+=4;
				 }
			}
			 //System.out.println(count);
			 
			// For value
			if(st.length()>=10 && st.length()<=12)
			{
				if(st.length()==10)
				{
					String s2 = st.substring(7,9);
					for(int l=0; l<arr.length; l++)
					{
						if(arr[l].equals(s2)) count+=2;
					}
				}
				if(st.length()==11)
				{
					String s2 = st.substring(7,9);
					for(int l=0; l<arr.length; l++)
					{
						if(arr[l]==s2) count+=3;
					}
				}
				if(st.length()==12)
				{
					String s2 = st.substring(7,9);
					for(int l=0; l<arr.length; l++)
					{
						if(arr[l]==s2) count+=4;
					}
				}
			}
			
			// For Last Character
			if(st.length()>=10 && st.length()<=12)
			{
				char ch=st.charAt(st.length()-1);
				for(int k=65; k<=90; k++)
				{
					if(k==ch) count+=1;
				}
			}
			
			if(count==st.length()) System.out.println("Valid");
			else System.out.println("Invalid");
		}
	}

	public static void main(String[] args)
	{
		 List<String> serialNumber = new LinkedList<String>();
		 serialNumber.add("QDB2012R20B");
		 serialNumber.add("RED190250E");
		 serialNumber.add("RFV201111T");
		 serialNumber.add("TUV20121000E"); // valid Coupen
		 serialNumber.add("AAA198710B");
		 serialNumber.add("ABC200010E");   // valid coupen
		 serialNumber.add("747");
		 serialNumber.add("CMQ190950T"); // valid Coupen
		 ValidCoupens.validCoupen(serialNumber);
//		 String st=serialNumber.get(0);
//		 String s1=st.substring(3, 7);
//		 for(int m=1900; m<=2019; m++)
//		 {
//			 String s2 = String.valueOf(m);
//			 //if(s2.equals(s2)) System.out.println("hello");
//		 }
	}
}
