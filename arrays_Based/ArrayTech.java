package arrays_Based;

public class ArrayTech {

	public static void main(String[] args) 
	{
		int n=5;
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i++]=arr[i]+1;
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}

}
