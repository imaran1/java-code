package sorting_Algo;

public class Selection_Sort 
{
	public static void main(String[] args) 
	{
		 Selection_Sort ob = new Selection_Sort();
	     int arr[] = {64,25,12,22,11};
	     ob.sort(arr);
	     System.out.println("Sorted array");
	     ob.printArray(arr);
	}

	private void sort(int[] arr) 
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int min_idx = i;
	        for (int j = i+1; j <arr.length; j++)
	            if (arr[j] < arr[i])
	                min_idx = j;	
			int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            printArray(arr);
		}
	}

	private void printArray(int[] arr) 
	{
		for(int i: arr)
			System.out.print(i+" ");
		System.out.println();
	}
}
