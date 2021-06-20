package arrays_Based;

public class InsertionSort2 
{
	public static void inSort(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n-1; i++)	
		{
			for(int j=0; j<n-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					printArray(arr);
				}
			}
		}
		//printArray(arr);
	}
	public static void main(String[] args) 
	{
		int arr [] = {1, 4, 3, 5, 6, 2};
//		for(int i=0; i<arr.length;i++)
//		{
//			for(int j=0; j<arr.length-1; j++)
//			{
//				if(arr[j]>arr[j+1])
//				{
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
	}

	public static void printArray(int arr[])
	{
		for(int i: arr)
			System.out.print(i+" ");
		System.out.println();
	}
}
