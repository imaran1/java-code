package subsequence_And_Substring;

public class String_Palindrom {

	public static void main(String[] args) 
	{
		String s="Imran";
		boolean flag=true;
		int n = s.length();
		for(int i=0; i<n; i++)
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				flag=false;
		if(!flag) System.out.println("No");
		else System.out.println("Yes");
	}
}
