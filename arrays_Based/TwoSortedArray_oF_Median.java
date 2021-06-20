package arrays_Based;

public class TwoSortedArray_oF_Median {
	
	public static void mergeArrays(int arr1[], int arr2[], int n1, int n2, int[] arr3) {
		  int i = 0, j = 0, k = 0;
	        while (i < n1 && j < n2)
	        {
	        	if (arr1[i] < arr2[j])
	                arr3[k++] = arr1[i++];
	            else
	                arr3[k++] = arr2[j++];
	        }
	        while (i < n1)
	            arr3[k++] = arr1[i++];
	        while (j < n2)
	            arr3[k++] = arr2[j++];
	      
	        int z=0;
	        for(int t=0; t<arr3.length; t++)
	    	   z +=arr3[t];
	        int y=z/arr3.length;
	        //System.out.println(z);
	        //System.out.println(y);
	        if(arr3.length%2==0) 
	        	System.out.println(arr3[y]+" "+arr3[y+1]);
	        else System.out.println(arr3[y]);
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7, 9};
		int n1 = arr1.length;
	    int[] arr2 = {2, 4, 6, 8};
	    int n2 = arr2.length;
	    
	    int[] arr3 = new int[n1+n2];
	    
	    TwoSortedArray_oF_Median.mergeArrays(arr1, arr2, n1, n2, arr3);
	     
        System.out.println("Array after merging:");
        for (int i = 0; i < n1 + n2; i++)
        	System.out.print(arr3[i] + " ");
        System.out.println();
        System.out.println(n1+n2);
        

	}

}
