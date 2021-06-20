package lambda_Expression;

import java.util.function.*;
public class BiPredicateDemo1 {

	public static void main(String[] args)
	{
		BiPredicate<Integer, Integer> Bi = (a,b)->(a+b)%2==0;
		System.out.println(Bi.test(17,54));
		System.out.println(Bi.test(13,21));
	}

}
