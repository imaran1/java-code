package arrays_Based;

public class InsertionSort 
{
	public static void inSort(int ar[])
	{
		    int sort = ar[ar.length - 1];
	        int i;
	        for (i = ar.length - 2; (i >= 0) && (ar[i] > sort); i--) {
	            ar[i + 1] = ar[i];
	            printArray(ar);
	        }
	        ar[i + 1] = sort;
	        printArray(ar);
	}
	public static void main(String[] args) 
	{
		int arr[]= {2,4,6,8,3};
		inSort(arr);
	}
	
	  private static void printArray(int[] ar)
	  {
	      for(int n: ar)
	      {
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
}
