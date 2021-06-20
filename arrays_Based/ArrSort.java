package arrays_Based;

import java.util.Scanner;

public class ArrSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //arr={153, 172, 100, 255, 325, 160};
		System.out.println("Enter the Arry Size");
		int n = sc.nextInt();
		System.out.println("Enter Array Elements");
		int arr [] = new int[n];
		for(int k=0; k<arr.length; k++) {
			arr[k]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			int a = i;
			for(int j=i+1; j<arr.length; j++) 
				if(arr[j]<arr[a])
					a=j;
			int temp = arr[a];
			arr[a]=arr[i];
			arr[i]=temp;
		}
		for(int i=0; i<arr.length; i++)
			System.out.print(" "+arr[i]);

	}

}
