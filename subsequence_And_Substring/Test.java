package subsequence_And_Substring;

public class Test {

	public static void main(String[] args) {
		int[] ab = {2,4,8,6,3};
		int[] arr= new int[8];
		for(int i=0; i<ab.length; i++)
		{
			arr[ab[i]-1]++;
		}

		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
	}

}
