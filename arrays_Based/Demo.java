package arrays_Based;

import java.util.Scanner;

public class Demo {
	
//	  public static int[] arr(int[] a,int count)
//	    {
//	        int[] temp=new int[count];
//	         for(int i=0;i<count;i++)
//	         {
//	            
//	                 temp[i]=a[i];
//	         }
//	         return temp;
//	    }
	
//    public static int[] add(int[] b)
//    {
//            int[] a=new int[b.length];
//            int pos=0;
//         int count=0;
//         for(int i=1;i<=a.length;i++)
//         {
//             if(i%2==0)
//             {
//                 a[pos]=b[i-1];
//                 pos++;
//                 count++;
//             }
//         }
//         int t[]=arr(a,count);
//         return t;
//    }

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Number: ");
		     int n=sc.nextInt();
		     int pos=0,x=0;
		     int[] b=new int[n];
		     for(int i=1;i<=n;i++)
		     {
		         b[pos]=i;
		         pos++;
		     }
		     for(int i=0; i<b.length; i++){
		    	 System.out.print(b[i]+" ");
		     }
		     int[] res=add(b);
		     while(x==0)
		        {
		           if(res.length==1)
		               for(int i=0;i<res.length;i++)
		                   System.out.println(res[i]);
		               x=1;
		         }
		     res=add(res);
	}
}