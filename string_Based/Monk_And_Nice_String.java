package string_Based;

import java.util.*;
public class Monk_And_Nice_String {
    public static void main(String[] args) 
    {
    	System.out.println("Enter:  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray = new String[n];
        //int n=strArray.length;
        int[] indexes = new int[n];
 
        for(int i = 0; i < n; i++) {
            strArray[i] = sc.next(); // [a,c,d,b]
            System.out.println("j: "+strArray[i]);
        }
 
        for(int i = 1; i < strArray.length; i ++) {
            for (int j = i-1; j >= 0; j--) {
                if(strArray[j].compareTo(strArray[i]) < 0) // [-2,-1,-3,-1]
                {
                    indexes[i]= indexes[i]+1; // [0, 
                    System.out.println(indexes[i]+"..."+j);
                }
            }
            
        }
 
        for(int k=0; k<indexes.length; k++)
        	System.out.println(indexes[k]);
    }
}
