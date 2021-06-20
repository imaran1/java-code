package string_Based;

public class Permutation{
	
	public void permute(String str, int l, int r)
    {
		String  rev = "";
        if (l==r) 
        {
        	 for ( int i = str.length() - 1; i >= 0; i-- )
                 rev = rev + str.charAt(i);
              if (str.equals(rev))
            	  System.out.println(str+" is a palindrome");
              else
             	 System.out.println(" String is not palindrome");
        }
        else
        {
             for (int i = l; i <= r; i++) 
             {
                 str = interChange(str, l, i);
                 permute(str, l + 1, r);
                 str = interChange(str, l, i);
             }
         }
    }
	
	  public String interChange(String a, int i, int j)
	    {
	        char ch;
	        char[] chArray = a.toCharArray(); //OnlineGDB by cnp0991
	        ch = chArray[i];
	        chArray[i] = chArray[j];
	        chArray[j] = ch;
	        return String.valueOf(chArray);
	    }

    public static void main(String[] args)
    {
    	  String str = "NINNIT";
          int n = str.length();
          Permutation permutation = new Permutation();
          permutation.permute(str, 0, n - 1);
    }
}