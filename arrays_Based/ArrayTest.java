package arrays_Based;

public class ArrayTest 
{
	public static void foo(int n)
	{
		if(n<=0) return;
		foo(n-1);
		System.out.print(n+ " ");
		foo(n-1);
		System.out.print(n+ " ");
	}
	public static void main(String[] args) 
	{
		String s1 = "5";
		String s2 = "3";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		int n=5;
		foo(n);
	}

}
