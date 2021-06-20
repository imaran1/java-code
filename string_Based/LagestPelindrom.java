package string_Based;

public class LagestPelindrom {
    static String highestValuePalindrome(String s, int n, int k) 
    {
        String st ="";
        String rev="";
        char ch[]=s.toCharArray(); // 9999
        for(int i=0; i<n; i++)
        {
            if((ch[i] != ch[n-1-i]) && k>0)
            {
                ch[i]='9';
                ch[n-1-i]='9';
                k--;
            }
        }
        st=String.valueOf(ch);
        for(int i=ch.length-1; i>=0; i--) rev+=ch[i];
        if(st.equals(rev)) return st;
        else return "-1";
    }


	public static void main(String[] args) {
		String str="932239";
		String rev="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) rev+=ch[i];
		System.out.println(rev);

	}

}
