package recursion;

public class Pattern
{
	public static void printPatt(int n, int m, boolean flag)
	{
		System.out.print(m+" ");
		if(flag==false && n==m) return;
		if(flag)
		{
			if(m-5>0) printPatt(n, m-5, true);
			else printPatt(n, m-5, false);
		}
		else printPatt(n, m+5, false);
	}
	public static void main(String[] args) 
	{
		int n=16;
		printPatt(n, n, true);
	}
}
