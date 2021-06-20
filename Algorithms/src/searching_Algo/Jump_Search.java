package searching_Algo;

public class Jump_Search
{
	public static void main(String[] args) 
	{
		 int arr[] = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
         int x = 55;
         int index = jumpSearch(arr, x);
         System.out.println("Number " + x + " is at index " + index);
	}

	private static int jumpSearch(int[] arr, int x) 
	{
		int n = arr.length;
		int step=(int) Math.sqrt(n);
		int prev=0;
		while(arr[Math.min(step, n)-1] < x)
		{
			prev=step;
			step+=(int) Math.sqrt(n);
			if(prev>=n) return -1;
		}
		while(arr[prev]<x)
		{
			 prev++;
	         if (prev == Math.min(step, n)) return -1;
		}
		if(arr[prev]==x) return prev;
		return -1;
	}
}
