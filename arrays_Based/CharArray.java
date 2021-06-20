package arrays_Based;

import java.util.*;
public class CharArray {

	public static void main(String[] args)
	{
		char ch[] = {'H','i',' ','N','o','o', 'r'}; // OutPut = ram hi
		ArrayList<Character> chalist1 = new ArrayList<Character>();
		ArrayList<Character> chalist2 = new ArrayList<Character>();
		boolean flag = false;
		for(int i=0; i<ch.length; i++) 
		{
			if(ch[i]==' ')
			{
				flag=true;
			}else if(flag && ch[i] !=' ')
			{
				chalist2.add(ch[i]);
			}else
			{
				chalist1.add(ch[i]);
			}
		}flag=false;
		chalist2.add(' ');
		chalist2.addAll(chalist1);
		System.out.println(chalist2);
		String str = "";
		for (Character c : chalist2)
		{
			str+=String.valueOf(c);
		}
		System.out.println(str);
	}

}
