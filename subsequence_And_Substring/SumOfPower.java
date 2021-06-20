package subsequence_And_Substring;

public class SumOfPower
{
	public static int sumPower(int X, int N, int num)
	{
		int value=X-(int) Math.pow(N, num);
		if(value<0) return 0;
		else if(value==0) return 1;
		else return sumPower(value, N, num+1) + sumPower(X, N, num+1);
	}
	
	public static void main(String[] args) 
	{
		int X=100, N=2, num=1;
		System.out.println(sumPower(X, N, num));
	}
}
