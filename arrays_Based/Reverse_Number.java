package arrays_Based;

import java.util.*;

public class Reverse_Number {
	
	public static void main(String[] args) {
		int arr[]= {21,43,54,23,67,90,84,34,45,55,76,26,48};
		Arrays.sort(arr);
		int c=0;
		for(int i=0; i<arr.length; i++) {
			int a=arr[i];
			int rev=0;
			while(a>0) {
				int digit=a%10;
				rev=rev*10+digit;
				a/=10;
				}for(int j=i; j<arr.length-1; j++)
					if(arr[j+1]==rev)
						c+=1;
		}System.out.println(c);
	}
}
