package arrays_Based;

import java.util.*;
public class ArrangeBig{
	public static void bigArrange(int arr[]) 
	{
		String bigArr="";
		Vector<String> reArr = new Vector<>();
		for(int i: arr)
		{
			String s=Integer.toString(i);
			reArr.add(s);
		}
		//System.out.println(reArr); // [3, 30, 34, 5, 9]
		Collections.sort(reArr, (X,Y) ->
            {
            	//System.out.println(X+"....."+Y);
                String XY = X + Y;
                //System.out.println("XY: "+XY);
                String YX = Y + X;
                //System.out.println("YX: "+YX);
                System.out.println(XY.compareTo(YX) > 0 ? -1 : 1);
                return XY.compareTo(YX) > 0 ? -1 : 1;
            });
       // System.out.print(reArr); //  9 5 34 3 30
	}
	public static void main(String[] args) 
	{
		int arr[]= {3,30,34,5,9};
		bigArrange(arr);
		System.out.println();
		System.out.println(Dompare("3", ""));
	}
	
	 public static int Dompare(String X, String Y)
     {
         String XY = X + Y;
         String YX = Y + X;
         return XY.compareTo(YX) > 0 ? -1 : 1;
     }
}
