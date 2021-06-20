package collection;

import java.util.*;

public class Collection_Class {

	public static void main(String[] args) {
		List<String> stack = new Stack<String>();
		List<String> alist = new ArrayList<String>();
		Set<String> setAll = new HashSet<String>();
		
		stack.add("Imran");
		stack.add("Noor");
		stack.add("Sahil");
		stack.add("Rehan");
		stack.add("Faizan");
		Iterator<String> i=stack.iterator();
		while(i.hasNext())
			System.out.print(" "+ i.next());
//		for(int k=0; k<stack.size(); k++)
//			System.out.print("get(): "+ stack.get(k));
		System.out.println();
		alist.add("Imr");
		alist.add("Nor");
		alist.add("Shil");
		alist.add("Rehn");
		alist.add("Faizn");
		Iterator<String> j=alist.iterator();
		while(j.hasNext())
			System.out.print(" "+ j.next());
		setAll.addAll(stack);
		setAll.addAll(alist);
		System.out.println(setAll);
	}

}
