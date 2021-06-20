package searching_Algo;

public class Linear_Search
{
	public static int search(int arr[], int k)
	{
		int a=0;
		for(int i=0; i<arr.length; i++)
			if(arr[i]==k)
			{
				a=i;
				break;
			}
		if(a!=0) return a;
		else return -1;
		    
	}
	public static void main(String[] args)
	{
		int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
		int k=110;
		System.out.println(k+" is present on index No: "+ search(arr, k));
	}
}
