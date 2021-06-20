package arrays_Based;
import java.util.*;
import java.util.stream.Collectors;



public class Sparse_Arrays {
	
	static int[] matchingStrings(String[] strings, String[] queries) {
		List<String> alist = new ArrayList<String>();
		int[] arr = new int[queries.length];
		int count=0;
		for(int i=0; i<strings.length; i++)
			alist.add(strings[i]);
		for(int i=0; i<queries.length; i++)
			alist.add(queries[i]);
		//Collections.sort(alist);
		//System.out.println(alist);
		List<String> show = 
	            alist.stream().sorted().collect(Collectors.toList());
		ListIterator<String> i = alist.listIterator();
		for(int k=0; k<queries.length; k++) {
			i.next();
			if(i.hasNext() && i.hasPrevious()) {
				count +=1;
				arr[k]=k;
			}
		}
		return arr;
		
	}
	public static void main(String[] args){
		String strArr [] = { "baba", "aba", "xzxb", "aba"};
		String strQueri [] = {"aba","ab", "xzxb"};
		int n=Sparse_Arrays.matchingStrings(strArr, strQueri).length;
		int arr[] = new int [n];
		for(int i=0; i<(Sparse_Arrays.matchingStrings(strArr, strQueri)).length; i++)
			System.out.print(" "+Sparse_Arrays.matchingStrings(strArr, strQueri)[i]);
	}
}
