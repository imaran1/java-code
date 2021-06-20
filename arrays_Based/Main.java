package arrays_Based;

public class Main
{
    public static int[] arr(int[] a,int count)
    {
        int[] temp=new int[count]; // count=3 and a[2,4,6]
         for(int i=0;i<count;i++)
         {
            
                 temp[i]=a[i];
         }
         return temp; // temp[2,4,6,0]
    }
    public static int[] add(int[] b)
    {
         int[] a=new int[b.length]; 
         int pos=0;
         int count=0;
         for(int i=1;i<=a.length;i++)
         {
             if(i%2==0)
             {
                 a[pos]=b[i-1]; // a[2,4,6]
                 pos++;
                 count++; // 1,2,3
             }
         }
         int t[]=arr(a,count); // t[2,4,6]
         return t;
    }
    
 public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
     int pos=0,x=0;
     int[] b=new int[6];
     for(int i=1;i<=6;i++)
     {
         b[pos]=i;
         pos++;
     } // b[1,2,3,4,5,6]
//     for(int i=0; i<b.length; i++){
//    	 System.out.print(b[i]+" ");
//     }
     System.out.println();
     int[] res=add(b); // b[1,2,3,4,5,6]
     // res[2,4,6,0] 
     for(int i=0; i<res.length; i++){
    	 System.out.print(res[i]+" ");
     } System.out.println("\n"+res.length);
        while(x==0)
        {
           
           if(res.length==1)
           {
               for(int i=0;i<res.length;i++)
               {
                   System.out.println(res[i]);
               }
               x=1;
           }
           res=add(res);
        }
 }
}