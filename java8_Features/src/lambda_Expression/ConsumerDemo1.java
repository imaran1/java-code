package lambda_Expression;

import java.util.function.*;
public class ConsumerDemo1 {

	public static void main(String[] args) 
	{
		Supplier<String> s = ()->{
			String otp = "";
			
			for(int i=0; i<6; i++)
				  otp+=(int)(Math.random()*10);
			System.out.println(otp);
			return otp;
		};String otp1 = "";
		System.out.println(s.get());   
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
