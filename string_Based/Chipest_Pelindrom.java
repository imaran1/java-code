package string_Based;

public class Chipest_Pelindrom {

	    public static int Process(String s, int a, int b)
	    {
	        int cost = 0;
	        int n = s.length();
	        char[] str = s.toCharArray();
	        for(int fi = 0 ; fi < n; fi++)
	        {
	            if(str[fi] == '/')
	            {
	                if(str[n - 1 - fi] == '/')
	                    if(a < b)
	                    {
	                        str[fi] = str[n - 1 - fi] = 'a';
	                        cost += 2 * a;
	                    }
	                    else
	                    {
	                        str[fi] = str[n - 1 - fi] = 'b';
	                        cost += 2 * b;
	                    }
	                else
	                {
	                    str[fi] = str[n - 1 - fi];
	                    if(str[n - 1 - fi] == 'a')
	                        cost += a;
	                    else
	                        cost += b;
	                }
	            }
	            else
	            {
	                if(str[fi] == 'a')
	                    if(str[n - 1 - fi] == 'b')
	                        return -1;
	                    else if(str[n - 1 - fi] == '/')
	                    {
	                        str[n - 1 - fi] = 'a';
	                        cost += a;
	                    }
	                if(str[fi] == 'b')
	                    if(str[n - 1 - fi] == 'a')
	                        return -1;
	                    else if(str[n - 1 - fi] == '/')
	                    {
	                        str[n - 1 - fi] = 'b';
	                        cost += b;
	                    }
	            }
	        }
	        return cost;
	    }
	    public static void main(String[] args)
	    {
	            String s="baba//aaa/ab//";
	            int a=72, b=23;
	            System.out.println(Process(s, a, b));
	    }
	}
