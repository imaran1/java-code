package string_Based;

public class RabinKarp {
	
	    public final static int d = 256;
	    static void search(String pat, String txt, int q)
	    {
	        int M = pat.length();  // GEEK / lenght = 4
	        int N = txt.length();  // "GEEKS FOR GEEKS";  / length =15
	        int i, j;
	        int p = 0; // hash value for pattern
	        int t = 0; // hash value for txt
	        int h = 1;
	        for (i = 0; i < M-1; i++)
	        {
	        	 h = (h*d)%q;   // h=3,9,5
	        }
	           
	        for (i = 0; i < M; i++)
	        {
	            p = (d*p + pat.charAt(i))%q;  // p=10,7,10,7
	            t = (d*t + txt.charAt(i))%q; // t=10,7,1,3  
	            
	        }
	        //System.out.print(t+" "+ p);
	        for (i = 0; i <= N - M; i++)
	        {
	            if ( p == t )
	            {
	            	//System.out.println(i+ " ");
	                for (j = 0; j < M; j++)
	                {
	                    if (txt.charAt(i+j) != pat.charAt(j))
	                        break;
	                }
	               
	                if (j == M) // [4]   
	                    System.out.println("Pattern found at index " + i);
	            }
	            if ( i < N-M )
	            {
	                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;
	                
	                if (t < 0) {
	                t = (t + q); System.out.print(t+" ");
	                }//
	            }
	        }//System.out.print(t+" "+ p);
	    }
	    public static void main(String[] args)
	    {
	        String txt = "AADBAACAADAABAABA";
	        String pat = "AABA";
	        int q = 11; 
	        search(pat, txt, q);
	        //System.out.println(19%11);
	}

}
