package subsequence_And_Substring;

public class Num_Palindrom
{

	public static void main(String[] args) 
	{
		int num=181;
		int n=num;
		int rev=0;
		while(n > 0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev==num);
		
		for(int i=1; i<=20; i++)
		{
			int flag=0;
			for(int j=2; j<i; j++)
				if(i%j==0) flag=i;
			if(flag==0)
				System.out.println(i);
		}
	}
}
