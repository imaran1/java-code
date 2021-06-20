package sorting_Algo;

public class QuickSort 
{
	static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void printArray(int[] arr, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	         
	    System.out.println();
	}
	 
	// Driver Code
	public static void main(String[] args)
	{
	    int[] arr = { 10, 7, 8, 9, 1, 5 };
	    int n = arr.length;
	     
	    quickSort(arr, 0, n - 1);
	    System.out.println("Sorted array: ");
	    printArray(arr, n);
	}

	 static void quickSort(int[] arr, int l, int h) 
	 {
		 if(l<h)
		 {
			 int pi = partition(arr, l, h);
			 quickSort(arr, l, pi-1);
			 quickSort(arr, pi+1, h); 
		 }
	 }

     static int partition(int[] arr, int l, int h) 
     {
		int pivot=arr[h];
		int i=l-1;
		for(int j=l; j<=h-1; j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, h);
    	return i+1;
	 }
}
