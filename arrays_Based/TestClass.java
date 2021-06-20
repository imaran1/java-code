package arrays_Based;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int j=0;
        while(n-->0)
        {
            arr[j]=sc.nextInt();
            j++;
        }
        TestClass.mostFrequent(arr, arr.length);
    }

    public static void mostFrequent(int arr[], int n)
    {
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       List<Integer> al = new ArrayList<>();
       for(int i=0; i<n; i++)
    	   map.put(arr[i], map.get(arr[i])==null ? 1 : map.get(arr[i])+1);
       
		for (Map.Entry<Integer,Integer> entry : map.entrySet())
			al.add(entry.getValue());
        Collections.sort(al); 
        System.out.println(getKey(map, al.get(188-1)));
        System.out.println(getKey(map, al.get(188-3)));
        System.out.println(map);
       
    }
    public static <K, V> K getKey(Map<K, V> map, V value)
	{
	    for (Map.Entry<K, V> entry: map.entrySet())
	    {
	        if (value.equals(entry.getValue())) 
	            return entry.getKey();
	    }
	        return null;
	}
}
