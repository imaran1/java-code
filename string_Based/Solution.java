package string_Based;

class Solution
{
  public static void countNum(String s, int n)
  {
	String st[]=s.split(" ");
    int count=0;
    int a=0;
    char ch[]= {'0','1','2','3','4','5','6','7','8','9'};
    for(int i=0; i<st.length; i++)
	{
    	String temp = st[i];
    	for(int l=0; l<temp.length(); l++)
    		if(temp.charAt(l)=='.')  a=temp.length()-1;
    	for(int j=0; j<temp.length(); j++)
    		for(int k=0; k<ch.length; k++)
    			if(temp.charAt(j)==ch[k]) count++;
    }
    System.out.println(count+1-a);
    //return count;
  }
  public static void main(String []args)
  {
     String str ="I will eat 2 burgers 23 fries & 12.255678 cokes l8r";
     int n=str.length();
    countNum(str, n);
   }
}