package string_Based;

public class IsPelindrom 
{
	static boolean checkPalindrome(String str)
    {
        int len = str.length();
        len--;
        for (int i=0; i<len; i++)
        {
            if (str.charAt(i) != str.charAt(len--))
                return false;
        }
        return true;
    }
	public static void main(String[] args)
	{
		String str = "aba";
		System.out.println(checkPalindrome(str));
	}

}
