package string_Based;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatt {

	public static void main(String[] args) {
		String  patt = "GEEKS FOR GEEKS";
		String str = "GEEK";
		int count = 0;
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(patt);
		   while (m.find()) {
			   count++;
			   System.out.println(m.start());
		   }System.out.println(count);
	    
	}

}
