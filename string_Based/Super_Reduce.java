package string_Based;

public class Super_Reduce 
{
	 static String superReducedString(String str)
	 {
		 if(str.length()<1)
			 return "Empty String";
		 if(str.length()==1)
			 return str;
		 for(int i=0; i<str.length(); i++)
		 {
			 if(i<str.length()-1 && str.charAt(i+1)==str.charAt(i))
			 {
				 return superReducedString(str.substring(0,i)+str.substring(i+2, str.length()));
			 }
		 }
		 return str;
	 }

	public static void main(String[] args) 
	{
		String s ="zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwx"
				+ "upqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh";
		String result = superReducedString(s);
		//System.out.println(result);
		System.out.println(s.substring(0,1));
	}
	//output
	//tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
}

