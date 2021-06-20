package arrays_Based;

public class CountPrimeNum 
{
	public static void printPrime(int n)
	{
		int count=0;
		for(int i=1; i<=n; i++)
			if(isPrime(i)) count++;
		System.out.println(count);
	}
	
	public static boolean isPrime(int i)
	{
		for(int j=2; j<i; j++)
			if(i%j==0)
				return false;
		return true;
	}
	public static void main(String[] args) 
	{       
		    int n=20;
			printPrime(n);
	}
}
