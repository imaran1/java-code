package string_Based;

import java.util.*;
public class FindIntercection {
	
//	 public static String FindIntersection(String[] strArr) {
//	        TreeSet<Integer> set1 = Arrays.stream(strArr[0].replace(" ", "")
//	        .split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
//	        TreeSet<Integer> set2 = Arrays.stream(strArr[1].replace(" ", "")
//	        .split(",")).map(Integer::parseInt).collect(toCollection(TreeSet::new));
//	        set1.retainAll(set2);
//
//	        return (set1.isEmpty() ? "false" : Arrays.toString(new TreeSet<>(set1).toArray()).replace("]", "").replace("[", "").replace(" ", ""));
//	  }
	
//	 public static String FindIntersection(String[] strArr) {
//	        // code goes here
//	        String ans = "false";
//	        String[] first = strArr[0].replaceAll(" ", "").split(",");
//	        String[] second = strArr[1].replaceAll(" ", "").split(",");
//	        for (String i : first) {
//	            for (String j : second) {
//	                if (i.matches(j)) {
//	                    ans += i + ",";
//	                }
//	            }
//	        }
//	        if (ans.contains(",")) {
//	            ans = ans.replaceFirst("false", "");
//	        }
//	        ans = replaceLast(",", "", ans);
//	        return ans;
//	    }
	    
	    public static String replaceLast(String find, String replace, String string) {
	        int lastIndex = string.lastIndexOf(find);

	        if (lastIndex == -1) {
	            return string;
	        }

	        String beginString = string.substring(0, lastIndex);
	        String endString = string.substring(lastIndex + find.length());

	        return beginString + replace + endString;
	    }
	 
	public static void main(String[] args) {
		String str [] = new String[] { };//new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        String ans = "";
        String[] first = str[0].replaceAll(" ", "").split(",");
        String[] second = str[1].replaceAll(" ", "").split(",");
        for (String i : first) {
            for (String j : second) {
                if (i.matches(j)) {
                    ans += i + ",";
                }
            }
        }
//        if (ans.contains(",")) {
//            ans = ans.replaceFirst("false", "");
//        }
//        ans = replaceLast(",", "", ans);
        System.out.println(ans);
		//System.out.print(FindIntersection(str)); 
		
	}
}
