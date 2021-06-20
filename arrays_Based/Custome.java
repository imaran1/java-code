package arrays_Based;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Custome
{
	public static void sortCustome(List<String> usort)
	{
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0; i<usort.size()-1; i++)
		{
			String s = usort.get(0); 
			if(i==0)
			{
				int a = usort.get(i).compareTo(usort.get(i));
				al.add(usort.get(i));
				int b = usort.get(i).compareTo(usort.get(i+1));
				al.add(usort.get(i+1));
			}
				
			else
			{
				int a=usort.get(i).compareTo(usort.get(i+1));
				if(a<0)
				{
					al.add(usort.get(i));
					al.add(usort.get(i+1));
				}
				else
				{
					al.add(usort.get(i+1));
					al.add(usort.get(i));
				}
					
			}
		}
		//Collections.sort(al);
		System.out.println(al);
	}
	public static void main(String[] args)
	{
		List<String> usort = new ArrayList<>();
		usort.add("6");
		usort.add("31415926535897932384626433832795");
		usort.add("1");
		usort.add("3");
		usort.add("10");
		usort.add("3");
		usort.add("5");
		sortCustome(usort);
		//System.out.println("3".compareTo("7"));
	}
}
