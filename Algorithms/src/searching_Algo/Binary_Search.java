package searching_Algo;

public class Binary_Search 
{
	public static void main(String[] args)
	{
	        int arr[] = { 2, 3, 4, 10, 40 };
	        int n = arr.length;
	        int x = 40;
	        int result = binarySearch(arr, 0, n - 1, x);
	        System.out.println(x+" is present on index No:"+result);
	}
	
	public static int binarySearch(int arr[], int l, int r, int k)
	{
		if(l<=r)
		{
			int mid = l+(r-l)/ 2;
			if(k==arr[mid]) return mid;
			if(arr[mid]>k) return binarySearch(arr, l, mid - 1, k);
					
			return binarySearch(arr, mid+1, r, k);
		}
		return -1;
	}
}
