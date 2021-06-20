package practice;

public class String_Permute {

	public static void main(String[] args) 
	{
		String str="ABC";
		int n=str.length();
		permute(str, 0, n-1);
	}

   private static void permute(String str, int l, int r) {
	  if(l==r)
		  System.out.println(0);
	  else {
		     for (int i = l; i <= r; i++) 
              { 
                str=swap(str,l,i);
                 permute(str, l+1, r);
               str=swap(str,l,i); 
             }
	      }
	}

   private static String swap(String arr, int a, int b) { 
	   char temp; 
       char[] charArray = arr.toCharArray(); 
       temp = charArray[a] ; 
       charArray[a] = charArray[b]; 
       charArray[b] = temp; 
       return String.valueOf(charArray);
   }	
}
