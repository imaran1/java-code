package stringAlgo;

public class KMP_Algo
{
	public static void kmpSearch(String txt, String pat)
	{
		int n=txt.length();
		int m=pat.length();
		int[] lps=new int[m];
		int i=0;
		int j=0;
		compute(pat, m, lps);
		while(i<n)
		{
			if(txt.charAt(i)==pat.charAt(j))
			{
				i++;
				j++;
			}
		   if(j==m) 
		   {
			   System.out.println("Found pattern at index " + (i - j));
			   j=lps[j-1];
		   }
		   else if(i<n && txt.charAt(i) != pat.charAt(j))
		   {
			   if(j!=0) j=lps[j-1];
			   else i=i+1;
		   }
		}
	}
	
	static private void compute(String pat, int m, int lps[])
	{
		int len=0;
		lps[0]=0;
		int i=1;
		while(i<m)
		{
			if(pat.charAt(i)==pat.charAt(len))
			{
				len++;
				lps[i]=len;
				i++;
			}
			else
			{
				if(len!=0) len=lps[len-1];
				else
				{
					lps[i]=len;
					i++;
				}
			}
		}
	}
	
	 public static void main(String[] args)
	    {
	        String txt = "AABAACAADAABAAABAA";
	        String pat = "AABA";
	        kmpSearch(txt, pat);
	    }
}
