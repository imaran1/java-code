package searching_Algo;

public class InterPolation_Search {

	public static void main(String[] args)
	{
        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };
        int n = arr.length;
        int x = 18;
        int index = interpolationSearch(arr, 0, n - 1, x);
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found.");
	}

	private static int interpolationSearch(int[] arr, int low, int hig, int x)
	{
		int n= arr.length;
		if(low<=hig && x>=arr[low] && x<=arr[hig])
		{
			int pos=low + (((hig-low)/(arr[hig]-arr[low]))*(x-arr[low]));
			if(arr[pos]==x) return pos;
			if(arr[pos]<x) 
				return  interpolationSearch(arr, pos+1, hig, x);
			return interpolationSearch(arr, low, pos-1, x);
		}
		return -1;
	}
}
