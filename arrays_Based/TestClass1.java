package arrays_Based;

import java.io.*;
import java.util.*;
class TestClass1 {

    public static int solve(int arr[], int len, int k)
    {
        Arrays.sort(arr);
        return arr[len-1];
    }
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter......");
        int t;
        int arr[];
        t=sc.nextInt();
        while(t-->0)
        {
           int n, k;
           n=sc.nextInt();
           k=sc.nextInt();
           arr=new int[n];
           int i=0;
           while(n-->0) arr[i++]=sc.nextInt();
           //for(int a: arr) System.out.print(a+" ");
           System.out.println(solve(arr,arr.length,k));
           n=0;
           k=0;
        }
        sc.close();
    }
}